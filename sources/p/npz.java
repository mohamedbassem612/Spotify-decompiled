package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$PluginMetadata;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class npz extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m321mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n() {
        hz00 hz00Var = hz00.UNKNOWN_EXTENSION;
        copyOnWrite();
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = (EsOfflinePlugin$PluginMetadata) ((g) this).instance;
        int i = EsOfflinePlugin$PluginMetadata.NAME_FIELD_NUMBER;
        esOfflinePlugin$PluginMetadata.n();
    }

    public final void q() {
        copyOnWrite();
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = (EsOfflinePlugin$PluginMetadata) ((g) this).instance;
        int i = EsOfflinePlugin$PluginMetadata.NAME_FIELD_NUMBER;
        esOfflinePlugin$PluginMetadata.o();
    }

    public final void r() {
        copyOnWrite();
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = (EsOfflinePlugin$PluginMetadata) ((g) this).instance;
        int i = EsOfflinePlugin$PluginMetadata.NAME_FIELD_NUMBER;
        esOfflinePlugin$PluginMetadata.p();
    }

    public final void s(boolean z) {
        copyOnWrite();
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = (EsOfflinePlugin$PluginMetadata) ((g) this).instance;
        int i = EsOfflinePlugin$PluginMetadata.NAME_FIELD_NUMBER;
        esOfflinePlugin$PluginMetadata.r(z);
    }

    public final void t(String str) {
        copyOnWrite();
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = (EsOfflinePlugin$PluginMetadata) ((g) this).instance;
        int i = EsOfflinePlugin$PluginMetadata.NAME_FIELD_NUMBER;
        esOfflinePlugin$PluginMetadata.s(str);
    }

    public final void u() {
        copyOnWrite();
        EsOfflinePlugin$PluginMetadata esOfflinePlugin$PluginMetadata = (EsOfflinePlugin$PluginMetadata) ((g) this).instance;
        int i = EsOfflinePlugin$PluginMetadata.NAME_FIELD_NUMBER;
        esOfflinePlugin$PluginMetadata.t();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m320clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m322mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m319clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m323mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
