package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gbo1 implements xbo1 {
    public final i25 a;

    public gbo1(i25 i25Var) {
        this.a = i25Var;
    }

    @Override // p.xbo1
    public final Object zza(Object... objArr) {
        i25 i25Var = this.a;
        if (i25Var.a) {
            ((utw0) i25Var.d).a = null;
            i25Var.a = false;
            bpn1 bpn1Var = (bpn1) i25Var.e;
            if (bpn1Var != null) {
                bpn1Var.b.getWritableDatabase().delete("tbl64158", null, null);
            }
        }
        return null;
    }

    @Override // p.xbo1
    public /* bridge */ /* synthetic */ Object zzb(Object[] objArr) {
        return super.zzb(objArr);
    }
}
