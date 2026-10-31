package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a7 extends zso1 {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ cha0 c;
    public final /* synthetic */ String d;
    public final Object e;

    public a7(cha0 cha0Var, String str) {
        this.c = cha0Var;
        this.d = str;
        this.e = cha0Var.b.b;
    }

    public void O(short s) {
        switch (this.b) {
            case 1:
                e0(String.valueOf(s & 65535));
                break;
            default:
                super.O(s);
                break;
        }
    }

    public void a0(int i) {
        switch (this.b) {
            case 1:
                e0(Long.toString(((long) i) & 4294967295L, 10));
                break;
            default:
                super.a0(i);
                break;
        }
    }

    public final kl1 c() {
        switch (this.b) {
            case 0:
                return this.c.b.b;
            default:
                return (kl1) this.e;
        }
    }

    public void e0(String str) {
        this.c.t(this.d, new nga0(str, false, null));
    }

    public void h0(String str) {
        switch (this.b) {
            case 0:
                this.c.t(this.d, new nga0(str, false, (h661) this.e));
                break;
            default:
                super.h0(str);
                break;
        }
    }

    public void j(byte b) {
        switch (this.b) {
            case 1:
                e0(String.valueOf(b & 255));
                break;
            default:
                super.j(b);
                break;
        }
    }

    public void z(long j) {
        String str;
        switch (this.b) {
            case 1:
                if (j == 0) {
                    str = "0";
                } else if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    int i = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
                e0(str);
                break;
            default:
                super.z(j);
                break;
        }
    }

    public a7(cha0 cha0Var, String str, h661 h661Var) {
        this.c = cha0Var;
        this.d = str;
        this.e = h661Var;
    }
}
