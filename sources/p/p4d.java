package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p4d implements fhr0 {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ q4d b;

    public p4d(ssw0 ssw0Var, q4d q4dVar) {
        this.a = ssw0Var;
        this.b = q4dVar;
    }

    public final boolean a(ehr0 ehr0Var) {
        if (ehr0Var instanceof bos0) {
            this.a.l(new o4d(this.b.a.d("android.permission.CAMERA"), false));
        }
        return false;
    }
}
