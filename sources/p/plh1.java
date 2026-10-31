package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum plh1 {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(mka.f("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(mka.f("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(mka.f("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(mka.f("kotlin/ULong", false));

    public final heg a;
    public final ajn0 b;
    public final heg c;

    plh1(heg hegVar) {
        this.a = hegVar;
        ajn0 ajn0VarF = hegVar.f();
        this.b = ajn0VarF;
        this.c = new heg(hegVar.a, ajn0.e(ajn0VarF.b() + "Array"));
    }
}
