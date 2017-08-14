/****** Object:  Table [dbo].[CANDIDATE]    Script Date: 8/14/2017 5:56:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CANDIDATE](
	[canID] [int] IDENTITY(1,1) NOT NULL,
	[candidateID] [nvarchar](50) NOT NULL,
	[fullName] [nvarchar](50) NULL,
	[birthDate] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[candidateType] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CANDIDATE] PRIMARY KEY CLUSTERED 
(
	[canID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Certificated]    Script Date: 8/14/2017 5:56:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Certificated](
	[certificatedID] [nvarchar](50) NOT NULL,
	[canID] [int] NOT NULL,
	[certificateName] [nvarchar](50) NULL,
	[certificateRank] [nvarchar](50) NULL,
	[ertificatedDate] [nvarchar](50) NULL,
 CONSTRAINT [PK_Certificated] PRIMARY KEY CLUSTERED 
(
	[certificatedID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ExperienceCandidate]    Script Date: 8/14/2017 5:56:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ExperienceCandidate](
	[experienceID] [int] IDENTITY(1,1) NOT NULL,
	[canID] [int] NOT NULL,
	[expInYear] [int] NULL,
	[proSkill] [nvarchar](50) NULL,
 CONSTRAINT [PK_ExperienceCandidate] PRIMARY KEY CLUSTERED 
(
	[experienceID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[FresherCandidate]    Script Date: 8/14/2017 5:56:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[FresherCandidate](
	[fresherID] [int] IDENTITY(1,1) NOT NULL,
	[canID] [int] NOT NULL,
	[graduationDate] [nvarchar](50) NULL,
	[graduationRank] [nvarchar](50) NULL,
	[education] [nvarchar](50) NULL,
 CONSTRAINT [PK_FresherCandidate] PRIMARY KEY CLUSTERED 
(
	[fresherID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[InternCandidate]    Script Date: 8/14/2017 5:56:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InternCandidate](
	[internID] [int] IDENTITY(1,1) NOT NULL,
	[canID] [int] NOT NULL,
	[majors] [nvarchar](50) NULL,
	[semester] [nvarchar](50) NULL,
	[universityName] [nvarchar](50) NULL,
 CONSTRAINT [PK_InternCandidate] PRIMARY KEY CLUSTERED 
(
	[internID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[CANDIDATE] ON 

INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (1, N'can1', N'hoangf', N'12/12/1993', N'0988023213', N'hoang@gmail.com', N'Experience')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (2, N'can2', N'hoàng', N'16/02/1993', N'0988023213', N'hoang@gmail.com', N'Fresher')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (3, N'can3', N'nguyên', N'12/1/2000', N'0123456789', N'nguyen@gmail.com', N'Intern')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (4, N'can4', N'hòa', N'11/11/1996', N'0123456789', N'ho@gmail.com', N'Fresher')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (5, N'sfsfd', N'sfsfsfs', N'12/1/1995', N'0123456789', N'lo@gmail.com', N'Experience')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (6, N'adaa', N'adad', N'11/11/1998', N'0123456789', N'ko@gmail.com', N'Intern')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (7, N'hoang1', N'nguyễn quang hoàng', N'16/02/1993', N'0988023213', N'hoang@gmail.com', N'Fresher')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (8, N'canNguyen', N'nguyên\', N'28/6/1995', N'0123456789', N'nguyen@gmil.com', N'Experience')
SET IDENTITY_INSERT [dbo].[CANDIDATE] OFF
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'b1', 7, N'bằng 1', N'tôt\', N'1/1/2014')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'b2', 7, N'bằng 2', N'khá\', N'12/1/2014')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'ce1', 1, N'bằng 1', N'tốt', N'12/12/2015')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'ce2', 1, N'bằng 2', N'khá', N'11/11/2013')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'cer1', 3, N'bằng a', N'tốt', N'11/11/2014')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'cer2', 3, N'bằng b', N'khá', N'12/12/2013')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'đsấ', 4, N'ádasd', N'adsasd', N'11/11/2016')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'fdsf', 8, N'sdfsdf', N'sfsdf', N'1/1/1998')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'sdff', 6, N'sdfsdf', N'sdfsdf', N'11/11/2015')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'sdfsdf', 5, N'sdfsd', N'sdfsdf', N'12/12/2014')
SET IDENTITY_INSERT [dbo].[ExperienceCandidate] ON 

INSERT [dbo].[ExperienceCandidate] ([experienceID], [canID], [expInYear], [proSkill]) VALUES (1, 1, 23, N'good')
SET IDENTITY_INSERT [dbo].[ExperienceCandidate] OFF
SET IDENTITY_INSERT [dbo].[FresherCandidate] ON 

INSERT [dbo].[FresherCandidate] ([fresherID], [canID], [graduationDate], [graduationRank], [education]) VALUES (1, 7, N'12/12/2016', N'Good', N'sp')
SET IDENTITY_INSERT [dbo].[FresherCandidate] OFF
SET IDENTITY_INSERT [dbo].[InternCandidate] ON 

INSERT [dbo].[InternCandidate] ([internID], [canID], [majors], [semester], [universityName]) VALUES (1, 3, N'toán tin', N'II', N'sư phạm')
INSERT [dbo].[InternCandidate] ([internID], [canID], [majors], [semester], [universityName]) VALUES (2, 6, N'tin', N'\II', N'sp')
SET IDENTITY_INSERT [dbo].[InternCandidate] OFF
ALTER TABLE [dbo].[Certificated]  WITH CHECK ADD  CONSTRAINT [FK_Certificated_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[Certificated] CHECK CONSTRAINT [FK_Certificated_CANDIDATE]
GO
ALTER TABLE [dbo].[ExperienceCandidate]  WITH CHECK ADD  CONSTRAINT [FK_ExperienceCandidate_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[ExperienceCandidate] CHECK CONSTRAINT [FK_ExperienceCandidate_CANDIDATE]
GO
ALTER TABLE [dbo].[FresherCandidate]  WITH CHECK ADD  CONSTRAINT [FK_FresherCandidate_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[FresherCandidate] CHECK CONSTRAINT [FK_FresherCandidate_CANDIDATE]
GO
ALTER TABLE [dbo].[InternCandidate]  WITH CHECK ADD  CONSTRAINT [FK_InternCandidate_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[InternCandidate] CHECK CONSTRAINT [FK_InternCandidate_CANDIDATE]
GO
