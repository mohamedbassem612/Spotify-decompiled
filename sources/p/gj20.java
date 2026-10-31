package p;

import com.google.firebase.crashlytics.ndk.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gj20 implements shn {
    public final fjn a;
    public final boolean b;
    public String c;

    public gj20(fjn fjnVar, boolean z) {
        this.a = fjnVar;
        this.b = z;
    }

    @Override // p.shn
    public final tmn0 a(String str) {
        return new vr51(this.a.b(str), (byte) 4);
    }

    @Override // p.shn
    public final boolean b() {
        String str = this.c;
        return str != null && d(str);
    }

    @Override // p.shn
    public final synchronized void c(String str, long j, e29 e29Var) throws Throwable {
        try {
            try {
                this.c = str;
                b bVar = new b(this, str, j, e29Var);
                if (this.b) {
                    bVar.a();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // p.shn
    public final boolean d(String str) {
        nt21 nt21Var = (nt21) this.a.b(str).a;
        return nt21Var != null && nt21Var.l();
    }
}
