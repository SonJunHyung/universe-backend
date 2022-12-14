package com.dream.universe.space.domain.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "SEQ_TB_SPACE_CODE"
        , sequenceName = "SEQ_TB_SPACE_CODE"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_SPACE")
public class Space {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
            , generator = "SEQ_TB_SPACE_CODE"
    )

    @Column(name = "SPACE_CODE")
    private long spaceCode;

    @Column(name = "MEMBER_CODE")
    private long memberCode;

    @Column(name = "SPACE_NAME")
    private String spaceName;

    @Column(name = "SPACE_INTRO")
    private String spaceIntro;

    @Column(name = "SPACE_TYPE")
    private String spaceType;

    @Column(name = "SPACE_PASSWORD")
    private String spacePassword;

    @Column(name = "SPACE_MAPINFO")
    private String spaceMapinfo;

    @Column(name = "SPACE_LIKE")
    private long spaceLike;

    @Column(name = "SPACE_BOOKMARK")
    private long spaceBookmark;

    @Column(name = "SPACE_THUMBNAIL")
    private String spaceThumbnail;

    @Column(name = "SPACE_REPORT")
    private long spaceReport;

    @Column(name = "SPACE_WARNING")
    private long spaceWarning;

    @Column(name = "SPACE_TAG1")
    private String spaceTag1;

    @Column(name = "SPACE_TAG2")
    private String spaceTag2;

    @Column(name = "SPACE_TAG3")
    private String spaceTag3;

    public Space(){};

    public Space(long spaceCode, long memberCode, String spaceName, String spaceIntro, String spaceType, String spacePassword, String spaceMapinfo, long spaceLike, long spaceBookmark, String spaceThumbnail, long spaceReport, long spaceWarning, String spaceTag1, String spaceTag2, String spaceTag3) {
        this.spaceCode = spaceCode;
        this.memberCode = memberCode;
        this.spaceName = spaceName;
        this.spaceIntro = spaceIntro;
        this.spaceType = spaceType;
        this.spacePassword = spacePassword;
        this.spaceMapinfo = spaceMapinfo;
        this.spaceLike = spaceLike;
        this.spaceBookmark = spaceBookmark;
        this.spaceThumbnail = spaceThumbnail;
        this.spaceReport = spaceReport;
        this.spaceWarning = spaceWarning;
        this.spaceTag1 = spaceTag1;
        this.spaceTag2 = spaceTag2;
        this.spaceTag3 = spaceTag3;
    }

    public long getSpaceCode() {
        return spaceCode;
    }

    public void setSpaceCode(long spaceCode) {
        this.spaceCode = spaceCode;
    }

    public long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(long memberCode) {
        this.memberCode = memberCode;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getSpaceIntro() {
        return spaceIntro;
    }

    public void setSpaceIntro(String spaceIntro) {
        this.spaceIntro = spaceIntro;
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    public String getSpacePassword() {
        return spacePassword;
    }

    public void setSpacePassword(String spacePassword) {
        this.spacePassword = spacePassword;
    }

    public String getSpaceMapinfo() {
        return spaceMapinfo;
    }

    public void setSpaceMapinfo(String spaceMapinfo) {
        this.spaceMapinfo = spaceMapinfo;
    }

    public long getSpaceLike() {
        return spaceLike;
    }

    public void setSpaceLike(long spaceLike) {
        this.spaceLike = spaceLike;
    }

    public long getSpaceBookmark() {
        return spaceBookmark;
    }

    public void setSpaceBookmark(long spaceBookmark) {
        this.spaceBookmark = spaceBookmark;
    }

    public String getSpaceThumbnail() {
        return spaceThumbnail;
    }

    public void setSpaceThumbnail(String spaceThumbnail) {
        this.spaceThumbnail = spaceThumbnail;
    }

    public long getSpaceReport() {
        return spaceReport;
    }

    public void setSpaceReport(long spaceReport) {
        this.spaceReport = spaceReport;
    }

    public long getSpaceWarning() {
        return spaceWarning;
    }

    public void setSpaceWarning(long spaceWarning) {
        this.spaceWarning = spaceWarning;
    }

    public String getSpaceTag1() {
        return spaceTag1;
    }

    public void setSpaceTag1(String spaceTag1) {
        this.spaceTag1 = spaceTag1;
    }

    public String getSpaceTag2() {
        return spaceTag2;
    }

    public void setSpaceTag2(String spaceTag2) {
        this.spaceTag2 = spaceTag2;
    }

    public String getSpaceTag3() {
        return spaceTag3;
    }

    public void setSpaceTag3(String spaceTag3) {
        this.spaceTag3 = spaceTag3;
    }

    @Override
    public String toString() {
        return "Space{" +
                "spaceCode=" + spaceCode +
                ", memberCode=" + memberCode +
                ", spaceName='" + spaceName + '\'' +
                ", spaceIntro='" + spaceIntro + '\'' +
                ", spaceType='" + spaceType + '\'' +
                ", spacePassword='" + spacePassword + '\'' +
                ", spaceMapinfo='" + spaceMapinfo + '\'' +
                ", spaceLike=" + spaceLike +
                ", spaceBookmark=" + spaceBookmark +
                ", spaceThumbnail='" + spaceThumbnail + '\'' +
                ", spaceReport=" + spaceReport +
                ", spaceWarning=" + spaceWarning +
                ", spaceTag1='" + spaceTag1 + '\'' +
                ", spaceTag2='" + spaceTag2 + '\'' +
                ", spaceTag3='" + spaceTag3 + '\'' +
                '}';
    }
}