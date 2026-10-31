package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class dhr0 {

    /* JADX INFO: Fake field, exist only in values array */
    dhr0 EF5;
    public static final /* synthetic */ dhr0[] b = {new dhr0("PENDING_INVITATION", 0), new dhr0("READY_TO_JOIN_EMPTY_BLEND", 1), new dhr0("READY_TO_JOIN_ALREADY_CREATED_BLEND", 2), new dhr0("MAX_MEMBERS", 3), new dhr0("ALREADY_JOINED", 4), new dhr0("DELETED", 5)};
    public static final bhr0 Companion = new bhr0();
    public static final znb0 a = dm5.S(2, v0r0.t);

    public static dhr0 valueOf(String str) {
        return (dhr0) Enum.valueOf(dhr0.class, str);
    }

    public static dhr0[] values() {
        return (dhr0[]) b.clone();
    }
}
