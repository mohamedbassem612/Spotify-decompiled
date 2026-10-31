package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum nln1 implements tin1 {
    /* JADX INFO: Fake field, exist only in values array */
    MEC_COLUMN_UNSPECIFIED(0),
    MEC_ID(60624),
    MEC_ACTIVITY_NAME(27932),
    MEC_ACTION(16297),
    MEC_EVENT_TIME(87675),
    MEC_DOWN_TIME(24368),
    MEC_POINTER_COUNT(39954),
    MEC_META_STATE(81898),
    MEC_BUTTON_STATE(41153),
    MEC_X(81015),
    MEC_Y(79969),
    MEC_DEVICE_ID(14294),
    MEC_TOOL_TYPE(97243),
    MEC_EDGE_FLAGS(91068),
    MEC_SOURCE(99646),
    MEC_PRESSURE(74067),
    MEC_SIZE(90142),
    MEC_FLAGS(75726),
    UNRECOGNIZED(-1);

    public final int a;

    nln1(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        xin1.a();
        throw null;
    }
}
