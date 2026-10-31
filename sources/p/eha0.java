package p;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class eha0 implements Closeable {
    public static final String[] e = new String[128];
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String f() {
        return men1.u(this.a, this.b, this.c, this.d);
    }

    public abstract boolean g();

    public abstract boolean h();

    public abstract double i();

    public abstract int j();

    public abstract String m();

    public abstract int o();

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public final void p(int i) throws meh {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new meh("Nesting too deep at ".concat(f()));
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int q(ye90 ye90Var);

    public abstract void u();

    public abstract void v();

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final void w(String str) throws kga0 {
        StringBuilder sbG = dv20.g(str, " at path ");
        sbG.append(f());
        throw new kga0(sbG.toString());
    }
}
