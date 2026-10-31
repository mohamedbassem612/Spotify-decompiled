package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ckl implements v190 {
    CONSUMER_UNSPECIFIED(0),
    CONSUMER_DJ(1),
    CONSUMER_AGENT(2),
    CONSUMER_AUDIO_RECOGNITION(3),
    UNRECOGNIZED(-1);

    public final int a;

    ckl(int i) {
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
