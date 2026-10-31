package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class von0 extends zon0 {
    public final Class s;

    public von0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            ncn0.d(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // p.zon0, p.apn0
    public final String b() {
        return this.s.getName();
    }

    @Override // p.zon0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (nhc1.S(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        StringBuilder sbT = l1d.t("Enum value ", str, " not found for type ");
        sbT.append(cls.getName());
        sbT.append('.');
        throw new IllegalArgumentException(sbT.toString());
    }
}
