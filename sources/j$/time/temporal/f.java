package j$.time.temporal;

import j$.nio.file.r;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class f implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor D(Map map, b0 b0Var, ResolverStyle resolverStyle) {
                LocalDate localDateOf;
                long jSubtractExact;
                ChronoField chronoField = ChronoField.YEAR;
                HashMap map2 = (HashMap) map;
                Long l = (Long) map2.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l2 = (Long) map2.get(temporalField);
                if (l != null && l2 != null) {
                    int iA = chronoField.b.a(chronoField, l.longValue());
                    long jLongValue = ((Long) map2.get(f.DAY_OF_QUARTER)).longValue();
                    f fVar2 = h.a;
                    if (Chronology.n(b0Var).equals(IsoChronology.INSTANCE)) {
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            localDateOf = LocalDate.of(iA, 1, 1).U(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                            jSubtractExact = Math.subtractExact(jLongValue, 1L);
                        } else {
                            localDateOf = LocalDate.of(iA, ((temporalField.range().a(temporalField, l2.longValue()) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (resolverStyle == ResolverStyle.STRICT) {
                                    x(localDateOf).b(this, jLongValue);
                                } else {
                                    range().b(this, jLongValue);
                                }
                            }
                            jSubtractExact = jLongValue - 1;
                        }
                        map2.remove(this);
                        map2.remove(chronoField);
                        map2.remove(temporalField);
                        return localDateOf.plusDays(jSubtractExact);
                    }
                    r.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final long K(TemporalAccessor temporalAccessor) {
                if (!p(temporalAccessor)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.g(ChronoField.DAY_OF_YEAR) - f.a[((temporalAccessor.g(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(temporalAccessor.j(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                long jK = K(temporal);
                range().b(this, j);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.a(chronoField, (j - jK) + temporal.j(chronoField));
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean p(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.DAY_OF_YEAR) || !temporalAccessor.h(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.h(ChronoField.YEAR)) {
                    return false;
                }
                f fVar2 = h.a;
                return Chronology.n(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final o range() {
                return o.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final o x(TemporalAccessor temporalAccessor) {
                if (!p(temporalAccessor)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                long j = temporalAccessor.j(f.QUARTER_OF_YEAR);
                if (j == 1) {
                    return IsoChronology.INSTANCE.isLeapYear(temporalAccessor.j(ChronoField.YEAR)) ? o.f(1L, 91L) : o.f(1L, 90L);
                }
                if (j == 2) {
                    return o.f(1L, 91L);
                }
                return (j == 3 || j == 4) ? o.f(1L, 92L) : range();
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final long K(TemporalAccessor temporalAccessor) {
                if (p(temporalAccessor)) {
                    return (temporalAccessor.j(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new n("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                long jK = K(temporal);
                range().b(this, j);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.a(chronoField, ((j - jK) * 3) + temporal.j(chronoField));
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean p(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.a;
                return Chronology.n(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final o range() {
                return o.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final o x(TemporalAccessor temporalAccessor) {
                if (p(temporalAccessor)) {
                    return range();
                }
                throw new n("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor D(Map map, b0 b0Var, ResolverStyle resolverStyle) {
                LocalDate localDateA;
                long j;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                HashMap map2 = (HashMap) map;
                Long l = (Long) map2.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map2.get(chronoField);
                if (l != null && l2 != null) {
                    int iA = temporalField.range().a(temporalField, l.longValue());
                    long jLongValue = ((Long) map2.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    f fVar4 = h.a;
                    if (Chronology.n(b0Var).equals(IsoChronology.INSTANCE)) {
                        LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateOf = localDateOf.V(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateOf = localDateOf.V(Math.subtractExact(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateA = localDateOf.V(Math.subtractExact(jLongValue, 1L)).a(chronoField, jLongValue2);
                            }
                            jLongValue2 = j + 1;
                            localDateA = localDateOf.V(Math.subtractExact(jLongValue, 1L)).a(chronoField, jLongValue2);
                        } else {
                            int iA2 = chronoField.b.a(chronoField, l2.longValue());
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (resolverStyle == ResolverStyle.STRICT) {
                                    o.f(1L, f.R(f.Q(localDateOf))).b(this, jLongValue);
                                } else {
                                    range().b(this, jLongValue);
                                }
                            }
                            localDateA = localDateOf.V(jLongValue - 1).a(chronoField, iA2);
                        }
                        map2.remove(this);
                        map2.remove(temporalField);
                        map2.remove(chronoField);
                        return localDateA;
                    }
                    r.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final long K(TemporalAccessor temporalAccessor) {
                if (p(temporalAccessor)) {
                    return f.P(LocalDate.D(temporalAccessor));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                range().b(this, j);
                return temporal.b(Math.subtractExact(j, K(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean p(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.a;
                return Chronology.n(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final o range() {
                return o.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final o x(TemporalAccessor temporalAccessor) {
                if (p(temporalAccessor)) {
                    return o.f(1L, f.R(f.Q(LocalDate.D(temporalAccessor))));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final long K(TemporalAccessor temporalAccessor) {
                if (p(temporalAccessor)) {
                    return f.Q(LocalDate.D(temporalAccessor));
                }
                throw new n("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                if (!p(temporal)) {
                    throw new n("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.b.a(f.WEEK_BASED_YEAR, j);
                LocalDate localDateD = LocalDate.D(temporal);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                int iG = localDateD.g(chronoField);
                int iP = f.P(localDateD);
                if (iP == 53 && f.R(iA) == 52) {
                    iP = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return temporal.i(localDateOf.plusDays(((iP - 1) * 7) + (iG - localDateOf.g(chronoField))));
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean p(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.a;
                return Chronology.n(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            public final o range() {
                return ChronoField.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final o x(TemporalAccessor temporalAccessor) {
                if (p(temporalAccessor)) {
                    return ChronoField.YEAR.b;
                }
                throw new n("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int P(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iO = localDate.O() - 1;
        int i = (3 - iOrdinal) + iO;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iO < i3) {
            if (localDate.O() != 180) {
                localDate = LocalDate.S(localDate.a, 180);
            }
            return (int) o.f(1L, R(Q(localDate.plusYears(-1L)))).d;
        }
        int i4 = ((iO - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
            return i4;
        }
        return 1;
    }

    public static int Q(LocalDate localDate) {
        int year = localDate.getYear();
        int iO = localDate.O();
        if (iO <= 3) {
            return iO - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iO >= 363) {
            return ((iO - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int R(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }
}
