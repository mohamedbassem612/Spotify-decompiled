package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0a implements wf80 {
    public static final Pattern a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // p.wf80
    public final zhq0 a(ug80 ug80Var) {
        yr31 yr31Var = ug80Var.h;
        yr31Var.h();
        char cK = yr31Var.k();
        if (cK == '\n') {
            yr31Var.h();
            return new zhq0(new bt50(), yr31Var.l(), (byte) 11);
        }
        if (!a.matcher(String.valueOf(cK)).matches()) {
            return new zhq0(new xzd1("\\"), yr31Var.l(), (byte) 11);
        }
        yr31Var.h();
        return new zhq0(new xzd1(String.valueOf(cK)), yr31Var.l(), (byte) 11);
    }
}
