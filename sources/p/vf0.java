package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vf0 {
    public final uq41 a;

    public vf0(uq41 uq41Var) {
        this.a = uq41Var;
    }

    public final yf0 a(iu30 iu30Var, iu30 iu30Var2, tka0 tka0Var, tka0 tka0Var2) {
        uq41 uq41Var = this.a;
        uq41Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(tka0Var);
        sb.append(tka0Var2);
        String string = sb.toString();
        LinkedHashMap linkedHashMap = uq41Var.a;
        vq41 vq41Var = (vq41) linkedHashMap.get(string);
        if (vq41Var == null) {
            vq41Var = new vq41();
            linkedHashMap.put(string, vq41Var);
        }
        return new yf0(iu30Var2, iu30Var, vq41Var);
    }
}
