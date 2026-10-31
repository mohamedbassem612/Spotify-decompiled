package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x3z implements ysi1 {
    public static final x3z a;
    public static final x3z b;
    public static final x3z c;
    public static final x3z d;
    public static final x3z e;
    public static final x3z f;
    public static final x3z g;
    public static final x3z h;
    public static final /* synthetic */ x3z[] i;

    static {
        x3z x3zVar = new x3z("EPISODE_GATED_VALUE_PROP_UNKNOWN", 0);
        a = x3zVar;
        x3z x3zVar2 = new x3z("EPISODE_GATED_VALUE_PROP_UNSPECIFIED", 1);
        b = x3zVar2;
        x3z x3zVar3 = new x3z("EPISODE_GATED_VALUE_PROP_AD_FREE", 2);
        c = x3zVar3;
        x3z x3zVar4 = new x3z("EPISODE_GATED_VALUE_PROP_EXTENDED", 3);
        d = x3zVar4;
        x3z x3zVar5 = new x3z("EPISODE_GATED_VALUE_PROP_EARLY_ACCESS", 4);
        e = x3zVar5;
        x3z x3zVar6 = new x3z("EPISODE_GATED_VALUE_PROP_VIDEO", 5);
        f = x3zVar6;
        x3z x3zVar7 = new x3z("EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES", 6);
        g = x3zVar7;
        x3z x3zVar8 = new x3z("EPISODE_GATED_VALUE_PROP_NONE", 7);
        h = x3zVar8;
        i = new x3z[]{x3zVar, x3zVar2, x3zVar3, x3zVar4, x3zVar5, x3zVar6, x3zVar7, x3zVar8};
    }

    public static x3z valueOf(String str) {
        return (x3z) Enum.valueOf(x3z.class, str);
    }

    public static x3z[] values() {
        return (x3z[]) i.clone();
    }
}
