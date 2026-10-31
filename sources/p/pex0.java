package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum pex0 implements v190 {
    PROFILE_EDITABLE_FEATURE_UNSPECIFIED(0),
    PROFILE_EDITABLE_FEATURE_BIO(1),
    PROFILE_EDITABLE_FEATURE_SOCIAL_HANDLE(2),
    UNRECOGNIZED(-1);

    public final int a;

    pex0(int i) {
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
