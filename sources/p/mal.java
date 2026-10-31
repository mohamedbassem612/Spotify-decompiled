package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mal {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public nal a() {
        return new nal(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(acg... acgVarArr) {
        if (!this.a) {
            hhg1.n("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(acgVarArr.length);
        for (acg acgVar : acgVarArr) {
            arrayList.add(acgVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            hhg1.n("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            hhg1.n("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    public void c(tye1... tye1VarArr) {
        if (!this.a) {
            hhg1.n("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tye1VarArr.length);
        for (tye1 tye1Var : tye1VarArr) {
            arrayList.add(tye1Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            hhg1.n("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            hhg1.n("At least one TLS version is required");
        }
    }
}
