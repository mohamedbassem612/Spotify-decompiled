package retrofit2;

import java.util.Objects;
import p.ry21;
import p.sy21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class HttpException extends RuntimeException {
    public final int a;
    public final String b;
    public final transient sy21 c;

    public HttpException(sy21 sy21Var) {
        Objects.requireNonNull(sy21Var, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        ry21 ry21Var = sy21Var.a;
        int i = ry21Var.d;
        sb.append(i);
        sb.append(" ");
        String str = ry21Var.c;
        sb.append(str);
        super(sb.toString());
        this.a = i;
        this.b = str;
        this.c = sy21Var;
    }
}
