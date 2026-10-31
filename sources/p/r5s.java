package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r5s {
    public final zfr a;

    public r5s(zfr zfrVar) {
        this.a = zfrVar;
    }

    public final Object a(String str, String str2, a8d1 a8d1Var) {
        int length = str2.length();
        rih1 rih1Var = rih1.a;
        if (length > 0 && !u890.j(str, str2)) {
            Object objY = this.a.y(str, str2, a8d1Var);
            return objY == d9n.a ? objY : rih1Var;
        }
        n57.e("unbanInContext should be used for unbanning on a given context, if you need a global unban, use unbanInContext instead, itemUri " + str + ",contextUri: " + str2);
        return rih1Var;
    }
}
