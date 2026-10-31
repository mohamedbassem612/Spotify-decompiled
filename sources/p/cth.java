package p;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cth {
    public static final cth a;
    public static final HashMap b;
    public static final /* synthetic */ cth[] c;

    /* JADX INFO: Fake field, exist only in values array */
    cth EF0;

    static {
        cth cthVar = new cth("X86_32", 0);
        cth cthVar2 = new cth("X86_64", 1);
        cth cthVar3 = new cth("ARM_UNKNOWN", 2);
        cth cthVar4 = new cth("PPC", 3);
        cth cthVar5 = new cth("PPC64", 4);
        cth cthVar6 = new cth("ARMV6", 5);
        cth cthVar7 = new cth("ARMV7", 6);
        cth cthVar8 = new cth("UNKNOWN", 7);
        a = cthVar8;
        cth cthVar9 = new cth("ARMV7S", 8);
        cth cthVar10 = new cth("ARM64", 9);
        c = new cth[]{cthVar, cthVar2, cthVar3, cthVar4, cthVar5, cthVar6, cthVar7, cthVar8, cthVar9, cthVar10};
        HashMap map = new HashMap(4);
        b = map;
        map.put("armeabi-v7a", cthVar7);
        map.put("armeabi", cthVar6);
        map.put("arm64-v8a", cthVar10);
        map.put("x86", cthVar);
    }

    public static cth valueOf(String str) {
        return (cth) Enum.valueOf(cth.class, str);
    }

    public static cth[] values() {
        return (cth[]) c.clone();
    }
}
