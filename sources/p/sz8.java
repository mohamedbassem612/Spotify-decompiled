package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sz8 {
    public String a;
    public String b;
    public List c;
    public fin d;
    public int e;
    public byte f;

    public final tz8 a() {
        String str;
        List list;
        if (this.f == 1 && (str = this.a) != null && (list = this.c) != null) {
            return new tz8(str, this.b, list, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" frames");
        }
        if ((this.f & 1) == 0) {
            sb.append(" overflowCount");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(fin finVar) {
        this.d = finVar;
    }

    public final void c(List list) {
        if (list != null) {
            this.c = list;
        } else {
            bhn0.i("Null frames");
        }
    }

    public final void d(int i) {
        this.e = i;
        this.f = (byte) (this.f | 1);
    }

    public final void e(String str) {
        this.b = str;
    }

    public final void f(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bhn0.i("Null type");
        }
    }
}
