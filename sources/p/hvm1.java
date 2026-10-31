package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import spotify.your_library.esperanto.proto.CuratedItems;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryTagFilter;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hvm1 extends g implements v2j0 {
    public final void A(boolean z) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.z(z);
    }

    public final void B(boolean z) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.A(z);
    }

    public final void C(int i) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i2 = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.B(i);
    }

    public final void D() {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.C();
    }

    public final void E() {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.D();
    }

    public final void F(boolean z) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.E(z);
    }

    public final void G(int i) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i2 = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.F(i);
    }

    public final void H(qsm1 qsm1Var) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder = (YourLibraryConfig$YourLibrarySortOrder) qsm1Var.build();
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.G(yourLibraryConfig$YourLibrarySortOrder);
    }

    public final void I(YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.G(yourLibraryConfig$YourLibrarySortOrder);
    }

    public final void J(YourLibraryTagFilter yourLibraryTagFilter) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.H(yourLibraryTagFilter);
    }

    public final void K(String str) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.I(str);
    }

    public final void L() {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.J();
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
    public final /* bridge */ /* synthetic */ r8 m966mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final CuratedItems n() {
        return ((YourLibraryRequestHeader) ((g) this).instance).n();
    }

    public final void q(boolean z) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.r(z);
    }

    public final void r(bho bhoVar) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        CuratedItems curatedItems = (CuratedItems) bhoVar.build();
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.s(curatedItems);
    }

    public final void s(CuratedItems curatedItems) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.s(curatedItems);
    }

    public final void t(jsm1 jsm1Var) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters = (YourLibraryConfig$YourLibraryFilters) jsm1Var.build();
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.t(yourLibraryConfig$YourLibraryFilters);
    }

    public final void u(YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.t(yourLibraryConfig$YourLibraryFilters);
    }

    public final void v(long j) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.u(j);
    }

    public final void w() {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.v();
    }

    public final void x() {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.w();
    }

    public final void y(boolean z) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.x(z);
    }

    public final void z(boolean z) {
        copyOnWrite();
        YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) ((g) this).instance;
        int i = YourLibraryRequestHeader.REMAINING_ENTITIES_FIELD_NUMBER;
        yourLibraryRequestHeader.y(z);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m965clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m967mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m964clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m968mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
