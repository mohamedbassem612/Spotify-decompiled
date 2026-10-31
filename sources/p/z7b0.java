package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v31 p.z7b0[], still in use, count: 1, list:
  (r1v31 p.z7b0[]) from 0x0236: CONSTRUCTOR (r2v9 p.t0z) = (r1v31 p.z7b0[]) (LINE:567) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z7b0 {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final List N0;
    public static final Map O0;
    public static final List X;
    public static final List Y;
    public static final List Z;
    public static final HashMap b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final /* synthetic */ t0z l1;
    public static final List t;
    public final boolean a;

    static {
        t0z t0zVar = new t0z(z7b0VarArr);
        l1 = t0zVar;
        b = new HashMap();
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            z7b0 z7b0Var = (z7b0) d7Var.next();
            b.put(z7b0Var.name(), z7b0Var);
        }
        t0z t0zVar2 = l1;
        ArrayList arrayList = new ArrayList();
        d7 d7Var2 = new d7(t0zVar2, (byte) 0);
        while (d7Var2.hasNext()) {
            Object next = d7Var2.next();
            if (((z7b0) next).a) {
                arrayList.add(next);
            }
        }
        o7h.p1(arrayList);
        o7h.p1(l1);
        z7b0 z7b0Var2 = ANNOTATION_CLASS;
        z7b0 z7b0Var3 = CLASS;
        c = p7h.M(new z7b0[]{z7b0Var2, z7b0Var3});
        d = p7h.M(new z7b0[]{LOCAL_CLASS, z7b0Var3});
        e = p7h.M(new z7b0[]{CLASS_ONLY, z7b0Var3});
        z7b0 z7b0Var4 = COMPANION_OBJECT;
        z7b0 z7b0Var5 = OBJECT;
        f = p7h.M(new z7b0[]{z7b0Var4, z7b0Var5, z7b0Var3});
        g = p7h.M(new z7b0[]{STANDALONE_OBJECT, z7b0Var5, z7b0Var3});
        h = p7h.M(new z7b0[]{INTERFACE, z7b0Var3});
        i = p7h.M(new z7b0[]{ENUM_CLASS, z7b0Var3});
        z7b0 z7b0Var6 = ENUM_ENTRY;
        z7b0 z7b0Var7 = PROPERTY;
        z7b0 z7b0Var8 = FIELD;
        t = p7h.M(new z7b0[]{z7b0Var6, z7b0Var7, z7b0Var8});
        z7b0 z7b0Var9 = PROPERTY_SETTER;
        X = Collections.singletonList(z7b0Var9);
        z7b0 z7b0Var10 = PROPERTY_GETTER;
        Y = Collections.singletonList(z7b0Var10);
        Z = Collections.singletonList(FUNCTION);
        z7b0 z7b0Var11 = FILE;
        N0 = Collections.singletonList(z7b0Var11);
        ag5 ag5Var = ag5.CONSTRUCTOR_PARAMETER;
        z7b0 z7b0Var12 = VALUE_PARAMETER;
        O0 = sqg0.J(new mmr0[]{new mmr0(ag5Var, z7b0Var12), new mmr0(ag5.FIELD, z7b0Var8), new mmr0(ag5.PROPERTY, z7b0Var7), new mmr0(ag5.FILE, z7b0Var11), new mmr0(ag5.PROPERTY_GETTER, z7b0Var10), new mmr0(ag5.PROPERTY_SETTER, z7b0Var9), new mmr0(ag5.RECEIVER, z7b0Var12), new mmr0(ag5.SETTER_PARAMETER, z7b0Var12), new mmr0(ag5.PROPERTY_DELEGATE_FIELD, z7b0Var8)});
    }

    public z7b0(boolean z) {
        super(str, i);
        this.a = z;
    }

    public static z7b0 valueOf(String str) {
        return (z7b0) Enum.valueOf(z7b0.class, str);
    }

    public static z7b0[] values() {
        return (z7b0[]) k1.clone();
    }
}
