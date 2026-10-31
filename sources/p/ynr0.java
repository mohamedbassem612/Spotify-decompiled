package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ynr0 implements v190 {
    bass(0),
    forte(1),
    brio(2),
    alto(3),
    canon(4),
    cello(5),
    ballad(6),
    ballad_bold(7),
    viola(8),
    viola_bold(9),
    mesto(10),
    mesto_bold(11),
    metronome(12),
    finale(13),
    finale_bold(14),
    minuet(15),
    minuet_bold(16),
    headlineLarge(17),
    headlineMedium(18),
    titleLarge(19),
    titleMedium(20),
    titleSmall(21),
    bodyMedium(22),
    bodyMediumBold(23),
    bodySmall(24),
    bodySmallBold(25),
    marginal(26),
    marginalBold(27),
    titleXsmall(28),
    UNRECOGNIZED(-1);

    public final int a;

    ynr0(int i) {
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
