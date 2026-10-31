package p;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wc9 extends i0i {
    public ig70 e;
    public int g;
    public int h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f163p;
    public float[] f = new float[0];
    public int i = 6;
    public float j = 1.0f;
    public boolean k = false;
    public boolean l = false;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public float q = 0.0f;
    public float r = 0.0f;
    public boolean s = false;
    public boolean t = false;
    public float u = 0.0f;
    public float v = 0.0f;
    public float w = 0.0f;

    public wc9() {
        this.c = npi1.c(10.0f);
        this.a = npi1.c(5.0f);
        this.b = npi1.c(5.0f);
        this.f163p = new ArrayList();
    }

    public void a(float f, float f2) {
        float f3 = this.s ? this.v : f - this.q;
        float f4 = this.t ? this.u : f2 + this.r;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.v = f3;
        this.u = f4;
        this.w = Math.abs(f4 - f3);
    }

    public final String b() {
        String strA;
        ig70 ig70Var;
        String str = "";
        int i = 0;
        while (true) {
            float[] fArr = this.f;
            if (i >= fArr.length) {
                return str;
            }
            if (i < 0 || i >= fArr.length) {
                strA = "";
            } else {
                ig70 ig70Var2 = this.e;
                if (ig70Var2 == null || ((ig70Var2 instanceof lir) && ((lir) ig70Var2).b != this.h)) {
                    ig70Var = ig70Var2;
                    ig70Var = ig70Var2;
                    int i2 = this.h;
                    lir lirVar = new lir();
                    lirVar.b = i2;
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (i3 == 0) {
                            stringBuffer.append(".");
                        }
                        stringBuffer.append("0");
                    }
                    lirVar.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
                    this.e = lirVar;
                    ig70Var = lirVar;
                }
                ig70Var = ig70Var2;
                ig70Var = ig70Var2;
                ig70Var = ig70Var2;
                strA = ig70Var.a(this.f[i], this);
            }
            if (strA != null && str.length() < strA.length()) {
                str = strA;
            }
            i++;
        }
    }
}
