package p;

import android.content.Intent;
import android.webkit.CookieManager;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yy8 implements Function, fq0 {
    public String a;
    public String b;
    public String c;

    public yy8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String a() {
        return this.b;
    }

    public Object apply(Object obj) {
        return new CompletableCreate(new lag((CookieManager) obj, this.a, this.b, this.c, (byte) 25));
    }

    public zy8 c() {
        String str;
        String str2;
        String str3 = this.a;
        if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new zy8(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" arch");
        }
        if (this.b == null) {
            sb.append(" libraryName");
        }
        if (this.c == null) {
            sb.append(" buildId");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public lu9 d() {
        String str = this.a;
        String str2 = this.b;
        if (str2 != null) {
            return new lu9(str, str2, this.c);
        }
        eg.m("spotifyLink was not set!");
        return null;
    }

    public void e(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bhn0.i("Null arch");
        }
    }

    public void f(String str) {
        if (str != null) {
            this.c = str;
        } else {
            bhn0.i("Null buildId");
        }
    }

    public String h() {
        return this.a;
    }

    public void i(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null libraryName");
        }
    }

    public String k() {
        return this.c;
    }

    public void l(Intent intent) {
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK != null) {
            this.b = strK;
            return;
        }
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        this.b = dataString;
    }

    public void m(String str) {
        this.c = str;
    }

    public void n(String str) {
        this.a = str;
    }

    public yy8() {
    }
}
