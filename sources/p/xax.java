package p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xax {
    public final String a;
    public acd1 b;
    public final StringBuilder c;
    public int d;
    public int e;
    public zbd1 f;
    public byte g;

    public xax(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                hhg1.n("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = acd1.a;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }

    public final char a() {
        return this.a.charAt(this.d);
    }

    public final boolean b() {
        return this.d < this.a.length() - this.g;
    }

    public final void c(int i) {
        zbd1 zbd1Var = this.f;
        if (zbd1Var == null || i > zbd1Var.b) {
            this.f = zbd1.e(i, this.b);
        }
    }

    public final void d(char c) {
        this.c.append(c);
    }
}
