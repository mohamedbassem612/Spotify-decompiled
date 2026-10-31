package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p5t extends kdn0 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ p5t(Object obj, byte b) {
        this.Y = b;
        this.Z = obj;
    }

    public final void h() {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                q5t q5tVar = (q5t) obj;
                q5tVar.a.g(q5tVar);
                break;
            default:
                mr30 mr30Var = (mr30) obj;
                Rect rect = (Rect) mr30Var.c.e();
                if (rect != null) {
                    ebp1.k(mr30Var.a.getWindow().getDecorView(), rect, mr30Var.b);
                }
                break;
        }
    }

    public void i() {
        switch (this.Y) {
            case 0:
                q5t q5tVar = (q5t) this.Z;
                q5tVar.a.k(q5tVar);
                break;
        }
    }
}
