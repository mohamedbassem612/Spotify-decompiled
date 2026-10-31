package p;

import com.spotify.contribution.repositoryimpl.f;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o67 implements qua0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qua0 b;

    public o67(uu00 uu00Var, vh4 vh4Var, byte b) {
        this.a = b;
        switch (b) {
            case 7:
                b3s b3sVar = b3s.c;
                this.b = new l27(uu00Var, vh4Var, (byte) 12);
                break;
            case 8:
                b3s b3sVar2 = b3s.c;
                this.b = new l27(uu00Var, vh4Var, (byte) 13);
                break;
            default:
                b3s b3sVar3 = b3s.c;
                this.b = new l27(uu00Var, vh4Var, (byte) 10);
                break;
        }
    }

    public final dmh1 a() {
        byte b = this.a;
        co9 co9Var = this.b;
        switch (b) {
            case 0:
                return ((l27) co9Var).a();
            case 1:
                return co9Var.a();
            case 2:
                return co9Var.a();
            case 3:
                return new fmh1(((l27) co9Var).b);
            case 4:
                return new fmh1(((l27) co9Var).b);
            case 5:
                return co9Var.a();
            case 6:
                return ((l27) co9Var).a();
            case 7:
                return ((l27) co9Var).a();
            default:
                return ((l27) co9Var).a();
        }
    }

    public final void b(ses0 ses0Var) {
        byte b = this.a;
        co9 co9Var = this.b;
        switch (b) {
            case 0:
                ((l27) co9Var).b(ses0Var);
                break;
            case 1:
                co9Var.b(ses0Var);
                break;
            case 2:
                co9Var.b(ses0Var);
                break;
            case 3:
                ((l27) co9Var).b(ses0Var);
                break;
            case 4:
                ((l27) co9Var).b(ses0Var);
                break;
            case 5:
                co9Var.b(ses0Var);
                break;
            case 6:
                ((l27) co9Var).b(ses0Var);
                break;
            case 7:
                ((l27) co9Var).b(ses0Var);
                break;
            default:
                ((l27) co9Var).b(ses0Var);
                break;
        }
    }

    public final pua0 c(iu30 iu30Var) {
        byte b = this.a;
        co9 co9Var = this.b;
        switch (b) {
            case 0:
                return ((l27) co9Var).b.c(iu30Var);
            case 1:
                return co9Var.c(iu30Var);
            case 2:
                return co9Var.c(iu30Var);
            case 3:
                return ((l27) co9Var).b.c(iu30Var);
            case 4:
                return ((l27) co9Var).b.c(iu30Var);
            case 5:
                return co9Var.c(iu30Var);
            case 6:
                return ((l27) co9Var).b.c(iu30Var);
            case 7:
                return ((l27) co9Var).b.c(iu30Var);
            default:
                return ((l27) co9Var).b.c(iu30Var);
        }
    }

    public final zjd1 d() {
        byte b = this.a;
        co9 co9Var = this.b;
        switch (b) {
            case 0:
                return ((l27) co9Var).b.a;
            case 1:
                return co9Var.b.a;
            case 2:
                return co9Var.b.a;
            case 3:
                return ((l27) co9Var).b.a;
            case 4:
                return ((l27) co9Var).b.a;
            case 5:
                return co9Var.b.a;
            case 6:
                return ((l27) co9Var).b.a;
            case 7:
                return ((l27) co9Var).b.a;
            default:
                return ((l27) co9Var).b.a;
        }
    }

    public o67(n67 n67Var, q8n q8nVar, chr0 chr0Var) {
        this.a = (byte) 0;
        this.b = new l27(n67Var, q8nVar, chr0Var);
    }

    public o67(q8n q8nVar, koc0 koc0Var) {
        this.a = (byte) 2;
        this.b = new co9(q8nVar, koc0Var);
    }

    public o67(String str, q8n q8nVar, qns0 qns0Var) {
        this.a = (byte) 5;
        this.b = new co9(str, q8nVar, qns0Var);
    }

    public o67(f fVar) {
        this.a = (byte) 1;
        this.b = new co9(fVar);
    }

    public o67(byte b, cp5 cp5Var, q8n q8nVar, xrc0 xrc0Var, boolean z) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = new l27((byte) 9, cp5Var, q8nVar, xrc0Var, z);
                break;
            default:
                this.b = new l27((byte) 8, cp5Var, q8nVar, xrc0Var, z);
                break;
        }
    }
}
