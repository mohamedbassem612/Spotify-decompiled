package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum fog0 implements v190 {
    MAPS_PROVIDER_UNSPECIFIED(0),
    MAPS_PROVIDER_GOOGLE(1),
    MAPS_PROVIDER_APPLE(2),
    UNRECOGNIZED(-1);

    public final int a;

    fog0(int i) {
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
