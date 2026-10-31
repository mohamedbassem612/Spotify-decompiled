package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sf5 extends s5 {
    public final /* synthetic */ byte a;
    public final e6b b;
    public final Object c;

    public sf5() {
        this.a = (byte) 2;
        this.b = new r980();
        this.c = new ArrayList();
    }

    @Override // p.s5
    public void a(ala1 ala1Var) {
        switch (this.a) {
            case 2:
                ((ArrayList) this.c).add(ala1Var.a);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[LOOP:1: B:12:0x002f->B:14:0x0033, LOOP_END] */
    @Override // p.s5
    public void e() {
        int i;
        StringBuilder sb;
        CharSequence charSequence;
        switch (this.a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        charSequence = (CharSequence) arrayList.get(size);
                    }
                    sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    this.b.g = sb.toString();
                    break;
                } while (zno1.w(0, charSequence.length(), charSequence) == charSequence.length());
                sb = new StringBuilder();
                while (i < size + 1) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                this.b.g = sb.toString();
                break;
        }
    }

    @Override // p.s5
    public final e6b f() {
        byte b = this.a;
        r980 r980Var = this.b;
        switch (b) {
            case 0:
                return (jf5) r980Var;
            case 1:
                return (y360) r980Var;
            default:
                return r980Var;
        }
    }

    @Override // p.s5
    public void i(ug80 ug80Var) {
        byte b = this.a;
        y360 y360Var = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ld50 ld50Var = new ld50();
                ld50Var.a.add((ala1) obj);
                ug80Var.e(ld50Var, (jf5) y360Var);
                break;
            case 1:
                ug80Var.e((ld50) obj, y360Var);
                break;
        }
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            default:
                if (cquVar.h >= 4) {
                    return new jwg(-1, cquVar.d + 4, false);
                }
                if (cquVar.i) {
                    return jwg.a(cquVar.f);
                }
                return null;
        }
    }

    public sf5(int i, ld50 ld50Var) {
        this.a = (byte) 1;
        y360 y360Var = new y360();
        this.b = y360Var;
        y360Var.g = i;
        this.c = ld50Var;
    }

    public sf5(jf5 jf5Var, ala1 ala1Var) {
        this.a = (byte) 0;
        this.b = jf5Var;
        this.c = ala1Var;
    }
}
