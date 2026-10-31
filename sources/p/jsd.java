package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jsd {
    public static final jsd a;
    public static final jsd b;
    public static final jsd c;
    public static final jsd d;
    public static final jsd e;
    public static final jsd f;
    public static final jsd g;
    public static final jsd h;
    public static final /* synthetic */ jsd[] i;

    static {
        jsd jsdVar = new jsd("NO_TEXT", 0);
        a = jsdVar;
        jsd jsdVar2 = new jsd("TITLE_ONLY", 1);
        b = jsdVar2;
        jsd jsdVar3 = new jsd("TITLE_AND_SUBTITLE", 2);
        c = jsdVar3;
        jsd jsdVar4 = new jsd("TITLE_AND_METADATA", 3);
        d = jsdVar4;
        jsd jsdVar5 = new jsd("LARGE_DESCRIPTION_ONLY", 4);
        e = jsdVar5;
        jsd jsdVar6 = new jsd("LARGE_NO_TEXT", 5);
        f = jsdVar6;
        jsd jsdVar7 = new jsd("DESCRIPTION_ONLY", 6);
        g = jsdVar7;
        jsd jsdVar8 = new jsd("SUBTITLE_ONLY", 7);
        h = jsdVar8;
        i = new jsd[]{jsdVar, jsdVar2, jsdVar3, jsdVar4, jsdVar5, jsdVar6, jsdVar7, jsdVar8};
    }

    public static jsd valueOf(String str) {
        return (jsd) Enum.valueOf(jsd.class, str);
    }

    public static jsd[] values() {
        return (jsd[]) i.clone();
    }
}
