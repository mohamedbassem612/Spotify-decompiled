package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class aic implements Cloneable {
    public final char[] a;
    public long b = -1;
    public long c = Long.MAX_VALUE;
    public zhc d;

    public aic(char[] cArr) {
        this.a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public aic clone() {
        try {
            aic aicVar = (aic) super.clone();
            zhc zhcVar = this.d;
            if (zhcVar != null) {
                aicVar.d = zhcVar.b();
            }
            return aicVar;
        } catch (CloneNotSupportedException unused) {
            hhg1.c();
            return null;
        }
    }

    public final String d() {
        String str = new String(this.a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public float e() {
        if (this instanceof cic) {
            return ((cic) this).e();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aic)) {
            return false;
        }
        aic aicVar = (aic) obj;
        if (this.b == aicVar.b && this.c == aicVar.c && Arrays.equals(this.a, aicVar.a)) {
            return Objects.equals(this.d, aicVar.d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        zhc zhcVar = this.d;
        return (i2 + (zhcVar != null ? zhcVar.hashCode() : 0)) * 31;
    }

    public int i() {
        if (this instanceof cic) {
            return ((cic) this).i();
        }
        return 0;
    }

    public final String k() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public final void l(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        zhc zhcVar = this.d;
        if (zhcVar != null) {
            zhcVar.n(this);
        }
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.b);
            sb.append("-");
            return pze0.h(this.c, ")", sb);
        }
        return k() + " (" + this.b + " : " + this.c + ") <<" + new String(this.a).substring((int) this.b, ((int) this.c) + 1) + ">>";
    }
}
