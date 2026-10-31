package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7r0 {
    public final ohv0 a;
    public final wnh1 b;
    public f0r0 c;

    public d7r0(ohv0 ohv0Var, wnh1 wnh1Var) {
        this.a = ohv0Var;
        this.b = wnh1Var;
    }

    public final void a(qq81 qq81Var) {
        f0r0 f0r0VarX = jon1.x(qq81Var);
        if (f0r0VarX != this.c) {
            this.c = f0r0VarX;
            String str = this.b.Y.c.a;
            boolean zJ = u890.j(f0r0VarX, f0r0.b);
            ohv0 ohv0Var = this.a;
            if (zJ) {
                ohv0Var.a(new nhv0("sign_up_email", str));
                return;
            }
            if (u890.j(f0r0VarX, f0r0.e)) {
                ohv0Var.a(new nhv0("sign_up_password", str));
                return;
            }
            if (u890.j(f0r0VarX, f0r0.a)) {
                ohv0Var.a(new nhv0("sign_up_birthday", str));
                return;
            }
            if (u890.j(f0r0VarX, f0r0.c)) {
                ohv0Var.a(new nhv0("sign_up_gender", str));
            } else if (u890.j(f0r0VarX, f0r0.d)) {
                ohv0Var.a(new nhv0("sign_up_display_name", str));
            } else {
                eg.o();
            }
        }
    }
}
