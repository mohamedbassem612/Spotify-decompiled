package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ka6 implements v190 {
    ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_IDLE(0),
    ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_CONNECTED(1),
    ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_MIGRATING(2),
    ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_RECOVERING(3),
    ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_ADOPTING(4),
    UNRECOGNIZED(-1);

    public final int a;

    ka6(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
