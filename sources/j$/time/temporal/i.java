package j$.time.temporal;

import j$.nio.file.r;
import j$.time.DateTimeException;
import j$.time.chrono.Chronology;
import j$.time.format.ResolverStyle;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class i implements TemporalField {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient o b;
    public final transient int c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.a = str2;
        this.b = o.f((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor D(Map map, b0 b0Var, ResolverStyle resolverStyle) {
        long j = this.c;
        long jLongValue = ((Long) ((HashMap) map).remove(this)).longValue();
        Chronology chronologyN = Chronology.n(b0Var);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return chronologyN.dateEpochDay(Math.subtractExact(jLongValue, j));
        }
        this.b.b(this, jLongValue);
        return chronologyN.dateEpochDay(jLongValue - j);
    }

    @Override // j$.time.temporal.TemporalField
    public final long K(TemporalAccessor temporalAccessor) {
        return temporalAccessor.j(ChronoField.EPOCH_DAY) + ((long) this.c);
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal O(Temporal temporal, long j) {
        if (this.b.e(j)) {
            return temporal.a(ChronoField.EPOCH_DAY, Math.subtractExact(j, this.c));
        }
        throw new DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean p(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final o range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final o x(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
            return this.b;
        }
        r.j("Unsupported field: ", this);
        return null;
    }
}
