package p;

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
public abstract class u8c0 implements bkl {
    public static final o8c0 a;
    public static final p8c0 b;
    public static final q8c0 c;
    public static final r8c0 d;
    public static final s8c0 e;
    public static final /* synthetic */ u8c0[] f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.o8c0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.p8c0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.q8c0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.r8c0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.s8c0] */
    static {
        ?? r0 = new u8c0() { // from class: p.o8c0
            public final void accept(Object obj) {
                ((m8c0) obj).getClass();
            }
        };
        a = r0;
        ?? r1 = new u8c0() { // from class: p.p8c0
            public final void accept(Object obj) {
                ((m8c0) obj).getClass();
            }
        };
        b = r1;
        ?? r2 = new u8c0() { // from class: p.q8c0
            public final void accept(Object obj) {
                ((m8c0) obj).getClass();
            }
        };
        c = r2;
        ?? r3 = new u8c0() { // from class: p.r8c0
            public final void accept(Object obj) {
                ((m8c0) obj).getClass();
            }
        };
        d = r3;
        ?? r4 = new u8c0() { // from class: p.s8c0
            public final void accept(Object obj) {
                ((m8c0) obj).e();
            }
        };
        e = r4;
        f = new u8c0[]{r0, r1, r2, r3, r4};
    }

    public static u8c0 valueOf(String str) {
        return (u8c0) Enum.valueOf(u8c0.class, str);
    }

    public static u8c0[] values() {
        return (u8c0[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return l1d.m("Event.", name());
    }
}
