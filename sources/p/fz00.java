package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum fz00 implements v190 {
    UNKNOWN(0),
    GENRE(1),
    MOOD(2),
    ACTIVITY(3),
    INSTRUMENT(4),
    TIME(5),
    ERA(6),
    AESTHETIC(7),
    AUDIENCE(8),
    CULTURAL_REFERENCE(9),
    GEOGRAPHIC_LOCATION(10),
    LANGUAGE(11),
    LOCATION(12),
    MEDIA(13),
    MUSIC_FESTIVAL(14),
    MUSIC_VENUE(15),
    MUSICAL_DESCRIPTOR(16),
    MUSICAL_TERM(17),
    PLACE(18),
    PUBLICATION(19),
    RADIO(20),
    RECORD_LABEL(21),
    RECORD_STORE(22),
    RELIGION(23),
    SLANG(24),
    UNRECOGNIZED(-1);

    public final int a;

    fz00(int i) {
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
