package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.jiy0[], still in use, count: 1, list:
  (r0v1 p.jiy0[]) from 0x003c: CONSTRUCTOR (r0v1 p.jiy0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jiy0 {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);

    public static final jiy0[] b;
    public static final /* synthetic */ t0z i;
    public final int a;

    static {
        Object next;
        i = new t0z(jiy0VarArr);
        jiy0[] jiy0VarArr = new jiy0[8];
        for (int i2 = 0; i2 < 8; i2++) {
            d7 it = i.iterator();
            do {
                d7 d7Var = it;
                if (!d7Var.hasNext()) {
                    next = null;
                    break;
                }
                next = d7Var.next();
            } while (((jiy0) next).a != i2);
            jiy0 jiy0Var = (jiy0) next;
            if (jiy0Var == null) {
                jiy0Var = INVALID;
            }
            jiy0VarArr[i2] = jiy0Var;
        }
        b = jiy0VarArr;
    }

    public jiy0(int i2) {
        super(str, i);
        this.a = i2;
    }

    public static jiy0 valueOf(String str) {
        return (jiy0) Enum.valueOf(jiy0.class, str);
    }

    public static jiy0[] values() {
        return (jiy0[]) h.clone();
    }

    public final int a(int i2) {
        return this.a | (i2 << 3);
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return l1d.o(sb, this.a, ')');
    }
}
