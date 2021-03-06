/****** Object:  Table [dbo].[CANDIDATE]    Script Date: 14/08/2017 20:53:01 ******/
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
/****** Object:  Table [dbo].[Certificated]    Script Date: 14/08/2017 20:53:01 ******/
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
/****** Object:  Table [dbo].[ExperienceCandidate]    Script Date: 14/08/2017 20:53:01 ******/
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
/****** Object:  Table [dbo].[FresherCandidate]    Script Date: 14/08/2017 20:53:01 ******/
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
/****** Object:  Table [dbo].[InternCandidate]    Script Date: 14/08/2017 20:53:01 ******/
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

INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (1, N'can1', N'nguyễn hoàng', N'16/02/1993', N'0988023213', N'hoang@gmail.com', N'Fresher')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (2, N'can2', N'nguyên', N'1/1/2011', N'0123456789', N'nguyen@gmail.com', N'Experience')
INSERT [dbo].[CANDIDATE] ([canID], [candidateID], [fullName], [birthDate], [phone], [email], [candidateType]) VALUES (3, N'can3', N'khoa', N'12/3/1994', N'0123654789', N'khoa@gmail.com', N'Intern')
SET IDENTITY_INSERT [dbo].[CANDIDATE] OFF
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'b1', 1, N'bằng 1', N'tốt', N'12/1/2017')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'b2', 1, N'bằng 2', N'khá', N'1/1/2016')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'b3', 2, N'bằng 3', N'giỏi', N'1/1/2017')
INSERT [dbo].[Certificated] ([certificatedID], [canID], [certificateName], [certificateRank], [ertificatedDate]) VALUES (N'tin1', 3, N'tin1', N'tốt', N'11/11/2014')
SET IDENTITY_INSERT [dbo].[FresherCandidate] ON 

INSERT [dbo].[FresherCandidate] ([fresherID], [canID], [graduationDate], [graduationRank], [education]) VALUES (1, 1, N'11/11/2016', N'Good', N'sư phạm')
SET IDENTITY_INSERT [dbo].[FresherCandidate] OFF
SET IDENTITY_INSERT [dbo].[InternCandidate] ON 

INSERT [dbo].[InternCandidate] ([internID], [canID], [majors], [semester], [universityName]) VALUES (1, 3, N'tin', N'II', N'cntt')
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
