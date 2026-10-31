package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.scrollsita.v1.Chapters;
import com.spotify.scrollsita.v1.Comments;
import com.spotify.scrollsita.v1.CompanionContent;
import com.spotify.scrollsita.v1.CreatorBio;
import com.spotify.scrollsita.v1.Credits;
import com.spotify.scrollsita.v1.CulturalMoments;
import com.spotify.scrollsita.v1.EpisodeDescription;
import com.spotify.scrollsita.v1.GatedContent;
import com.spotify.scrollsita.v1.ListeningParty;
import com.spotify.scrollsita.v1.LiveEvents;
import com.spotify.scrollsita.v1.Lyrics;
import com.spotify.scrollsita.v1.Merch;
import com.spotify.scrollsita.v1.Polls;
import com.spotify.scrollsita.v1.Section;
import com.spotify.scrollsita.v1.ShowDescription;
import com.spotify.scrollsita.v1.SmartShuffle;
import com.spotify.scrollsita.v1.Transcript;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bf51 extends g implements v2j0 {
    public final void A(Merch merch) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.F0(merch);
    }

    public final void B(Polls polls) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.G0(polls);
    }

    public final void C(z381 z381Var) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        ShowDescription showDescription = (ShowDescription) z381Var.build();
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.H0(showDescription);
    }

    public final void D(SmartShuffle smartShuffle) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.I0(smartShuffle);
    }

    public final void E(Transcript transcript) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.J0(transcript);
    }

    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m205mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Chapters chapters) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.u0(chapters);
    }

    public final void q(Comments comments) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.v0(comments);
    }

    public final void r(CompanionContent companionContent) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.w0(companionContent);
    }

    public final void s(CreatorBio creatorBio) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.x0(creatorBio);
    }

    public final void t(Credits credits) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.y0(credits);
    }

    public final void u(CulturalMoments culturalMoments) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.z0(culturalMoments);
    }

    public final void v(h3z h3zVar) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        EpisodeDescription episodeDescription = (EpisodeDescription) h3zVar.build();
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.A0(episodeDescription);
    }

    public final void w(GatedContent gatedContent) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.B0(gatedContent);
    }

    public final void x(ListeningParty listeningParty) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.C0(listeningParty);
    }

    public final void y(LiveEvents liveEvents) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.D0(liveEvents);
    }

    public final void z(Lyrics lyrics) {
        copyOnWrite();
        Section section = (Section) ((g) this).instance;
        int i = Section.SECTION_INFO_FIELD_NUMBER;
        section.E0(lyrics);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m204clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m206mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m203clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m207mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super/*p.r8*/.mergeFrom(phcVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super/*p.r8*/.mergeFrom(lwgVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super/*p.r8*/.mergeFrom(s2j0Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super/*p.r8*/.mergeFrom(bArr);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }
}
