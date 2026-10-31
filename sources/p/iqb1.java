package p;

import java.util.Locale;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class iqb1 {
    public static final fqb1 a;
    public static final iqb1[] b;
    public static final /* synthetic */ iqb1[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.fqb1] */
    static {
        ?? r0 = new iqb1() { // from class: p.fqb1
        };
        a = r0;
        c = new iqb1[]{r0, new iqb1() { // from class: p.gqb1
            @Override // p.iqb1
            public final boolean a(String str) {
                return (str.equals("orbit.settings") || str.equals("offline2") || str.equals("offline_lists.bnk")) ? false : true;
            }
        }, new iqb1() { // from class: p.hqb1
            @Override // p.iqb1
            public final boolean a(String str) {
                return true;
            }
        }};
        b = values();
    }

    public static iqb1 valueOf(String str) {
        return (iqb1) Enum.valueOf(iqb1.class, str);
    }

    public static iqb1[] values() {
        return (iqb1[]) c.clone();
    }

    public boolean a(String str) {
        return str.equals("state.restore");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return super.toString().toLowerCase(Locale.US);
    }
}
