package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum b7w0 {
    /* JADX INFO: Fake field, exist only in values array */
    Flat(2131955606, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Acoustic(2131955599, new float[]{4.9f, 3.95f, 2.15f, 1.75f, 3.5f, 2.15f}),
    /* JADX INFO: Fake field, exist only in values array */
    BassBooster(2131955600, new float[]{4.25f, 3.5f, 1.25f, 0.0f, 0.0f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    BassReducer(2131955601, new float[]{-4.25f, -3.5f, -1.25f, 0.0f, 0.0f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Classical(2131955602, new float[]{3.75f, 3.0f, -1.5f, -1.5f, 0.0f, 3.75f}),
    /* JADX INFO: Fake field, exist only in values array */
    Dance(2131955603, new float[]{6.55f, 4.99f, 1.92f, 3.65f, 5.15f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Deep(2131955604, new float[]{3.55f, 1.75f, 2.85f, 2.5f, 1.45f, -2.15f}),
    /* JADX INFO: Fake field, exist only in values array */
    Electronic(2131955605, new float[]{3.8f, 1.2f, -2.15f, 2.25f, 0.85f, 4.8f}),
    /* JADX INFO: Fake field, exist only in values array */
    HipHip(2131955607, new float[]{4.25f, 1.5f, -1.0f, -1.0f, 1.5f, 3.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Jazz(2131955608, new float[]{3.0f, 1.5f, -1.5f, -1.5f, 0.0f, 3.75f}),
    /* JADX INFO: Fake field, exist only in values array */
    Latin(2131955609, new float[]{3.0f, 0.0f, -1.5f, -1.5f, -1.5f, 4.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    Loudness(2131955610, new float[]{4.0f, 0.0f, -2.0f, 0.0f, -1.0f, 1.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Lounge(2131955611, new float[]{-1.5f, -0.5f, 4.0f, 2.5f, 0.0f, 1.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    Piano(2131955612, new float[]{2.0f, 0.0f, 3.0f, 1.5f, 3.5f, 3.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    Pop(2131955613, new float[]{-1.0f, 0.0f, 4.0f, 4.0f, 2.0f, -1.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    RnB(2131955614, new float[]{6.92f, 5.65f, -2.19f, -1.5f, 2.32f, 3.75f}),
    /* JADX INFO: Fake field, exist only in values array */
    Rock(2131955615, new float[]{4.0f, 3.0f, -0.5f, -1.0f, 0.5f, 4.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    SmallSpeakers(2131955616, new float[]{4.25f, 3.5f, 1.25f, 0.0f, -1.25f, -4.25f}),
    /* JADX INFO: Fake field, exist only in values array */
    SpokenWord(2131955617, new float[]{-0.47f, 0.0f, 3.46f, 4.61f, 4.84f, 0.0f}),
    /* JADX INFO: Fake field, exist only in values array */
    TrebleBooster(2131955618, new float[]{0.0f, 0.0f, 0.0f, 1.25f, 2.5f, 5.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    TrebleReducer(2131955619, new float[]{0.0f, 0.0f, 0.0f, -1.25f, -2.5f, -5.5f}),
    /* JADX INFO: Fake field, exist only in values array */
    VocalBooster(2131955620, new float[]{-3.0f, -3.0f, 3.75f, 3.75f, 3.0f, -1.5f});

    public final int a;
    public final float[] b;

    b7w0(int i, float[] fArr) {
        this.a = i;
        this.b = fArr;
        if (fArr.length == 6) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }
}
