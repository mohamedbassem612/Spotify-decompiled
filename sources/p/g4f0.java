package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.libs.connect.events.proto.LogoutNonAuth;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g4f0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m346mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        str.getClass();
        copyOnWrite();
        LogoutNonAuth logoutNonAuth = (LogoutNonAuth) ((g) this).instance;
        int i = LogoutNonAuth.PROTOCOL_VERSION_FIELD_NUMBER;
        logoutNonAuth.n().put("backend_session_termination_attempted", str);
    }

    public final void q(String str) {
        copyOnWrite();
        LogoutNonAuth logoutNonAuth = (LogoutNonAuth) ((g) this).instance;
        int i = LogoutNonAuth.PROTOCOL_VERSION_FIELD_NUMBER;
        logoutNonAuth.p(str);
    }

    public final void r(String str) {
        copyOnWrite();
        LogoutNonAuth logoutNonAuth = (LogoutNonAuth) ((g) this).instance;
        int i = LogoutNonAuth.PROTOCOL_VERSION_FIELD_NUMBER;
        logoutNonAuth.q(str);
    }

    public final void s() {
        copyOnWrite();
        LogoutNonAuth logoutNonAuth = (LogoutNonAuth) ((g) this).instance;
        int i = LogoutNonAuth.PROTOCOL_VERSION_FIELD_NUMBER;
        logoutNonAuth.r();
    }

    public final void t() {
        copyOnWrite();
        LogoutNonAuth logoutNonAuth = (LogoutNonAuth) ((g) this).instance;
        int i = LogoutNonAuth.PROTOCOL_VERSION_FIELD_NUMBER;
        logoutNonAuth.s();
    }

    public final void u() {
        copyOnWrite();
        LogoutNonAuth logoutNonAuth = (LogoutNonAuth) ((g) this).instance;
        int i = LogoutNonAuth.PROTOCOL_VERSION_FIELD_NUMBER;
        logoutNonAuth.t();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m345clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m347mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m344clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m348mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
