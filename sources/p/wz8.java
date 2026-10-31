package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wz8 {
    public int a;
    public byte b;
    public Comparable c;
    public Object d;

    public xz8 a() {
        String str;
        List list;
        if (this.b == 1 && (str = (String) this.c) != null && (list = (List) this.d) != null) {
            return new xz8(str, list, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.c) == null) {
            sb.append(" name");
        }
        if ((1 & this.b) == 0) {
            sb.append(" importance");
        }
        if (((List) this.d) == null) {
            sb.append(" frames");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public void b(List list) {
        if (list != null) {
            this.d = list;
        } else {
            bhn0.i("Null frames");
        }
    }

    public void c(int i) {
        this.a = i;
        this.b = (byte) (this.b | 1);
    }

    public void d(String str) {
        if (str != null) {
            this.c = str;
        } else {
            bhn0.i("Null name");
        }
    }
}
