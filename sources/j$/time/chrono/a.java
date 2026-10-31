package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class a implements Chronology {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static Chronology D(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) a.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            b.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    public static ChronoLocalDate K(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateB2.i(new j$.time.temporal.l(DayOfWeek.p((int) j3).getValue(), (byte) 0));
        }
        long j5 = j3 - 1;
        chronoLocalDateB2 = chronoLocalDateB2.b(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateB2.i(new j$.time.temporal.l(DayOfWeek.p((int) j3).getValue(), (byte) 0));
    }

    public static void p(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
    }

    public static Chronology x(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            Chronology chronology = (Chronology) concurrentHashMap.get(str);
            if (chronology == null) {
                chronology = (Chronology) b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
                    if (str.equals(chronology2.getId()) || str.equals(chronology2.getCalendarType())) {
                        return chronology2;
                    }
                }
                j$.nio.file.r.h("Unknown chronology: ".concat(str));
                return null;
            }
            l lVar = l.l;
            lVar.getClass();
            D(lVar, "Hijrah-umalqura");
            r rVar = r.c;
            rVar.getClass();
            D(rVar, "Japanese");
            w wVar = w.c;
            wVar.getClass();
            D(wVar, "Minguo");
            c0 c0Var = c0.c;
            c0Var.getClass();
            D(c0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.getId().equals("ISO")) {
                        D(aVar, aVar.getId());
                    }
                }
                IsoChronology isoChronology = IsoChronology.INSTANCE;
                isoChronology.getClass();
                D(isoChronology, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate M(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return dateEpochDay(((Long) map.remove(chronoField)).longValue());
        }
        O(map, resolverStyle);
        ChronoLocalDate chronoLocalDateQ = Q(map, resolverStyle);
        if (chronoLocalDateQ != null) {
            return chronoLocalDateQ;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (map.containsKey(chronoField2)) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                    return P(map, resolverStyle);
                }
                ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(chronoField5)) {
                        int iA = w(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            long jSubtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                            return date(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int iA2 = w(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
                        ChronoLocalDate chronoLocalDateB = date(iA, iA2, 1).b((w(chronoField5).a(chronoField5, ((Long) map.remove(chronoField5)).longValue()) - 1) + ((w(chronoField4).a(chronoField4, ((Long) map.remove(chronoField4)).longValue()) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateB.g(chronoField3) == iA2) {
                            return chronoLocalDateB;
                        }
                        j$.nio.file.r.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField6)) {
                        int iA3 = w(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            return K(date(iA3, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                        }
                        int iA4 = w(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
                        ChronoLocalDate chronoLocalDateI = date(iA3, iA4, 1).b((w(chronoField4).a(chronoField4, ((Long) map.remove(chronoField4)).longValue()) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new j$.time.temporal.l(DayOfWeek.p(w(chronoField6).a(chronoField6, ((Long) map.remove(chronoField6)).longValue())).getValue(), (byte) 0));
                        if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateI.g(chronoField3) == iA4) {
                            return chronoLocalDateI;
                        }
                        j$.nio.file.r.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField7)) {
                int iA5 = w(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                if (resolverStyle != ResolverStyle.LENIENT) {
                    return dateYearDay(iA5, w(chronoField7).a(chronoField7, ((Long) map.remove(chronoField7)).longValue()));
                }
                return dateYearDay(iA5, 1).b(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(chronoField8)) {
                ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(chronoField9)) {
                    int iA6 = w(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return dateYearDay(iA6, 1).b(Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    ChronoLocalDate chronoLocalDateB2 = dateYearDay(iA6, 1).b((w(chronoField9).a(chronoField9, ((Long) map.remove(chronoField9)).longValue()) - 1) + ((w(chronoField8).a(chronoField8, ((Long) map.remove(chronoField8)).longValue()) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateB2.g(chronoField2) == iA6) {
                        return chronoLocalDateB2;
                    }
                    j$.nio.file.r.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField10)) {
                    int iA7 = w(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return K(dateYearDay(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
                    }
                    ChronoLocalDate chronoLocalDateI2 = dateYearDay(iA7, 1).b((w(chronoField8).a(chronoField8, ((Long) map.remove(chronoField8)).longValue()) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new j$.time.temporal.l(DayOfWeek.p(w(chronoField10).a(chronoField10, ((Long) map.remove(chronoField10)).longValue())).getValue(), (byte) 0));
                    if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateI2.g(chronoField2) == iA7) {
                        return chronoLocalDateI2;
                    }
                    j$.nio.file.r.h("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public void O(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.P(l.longValue());
            }
            ChronoLocalDate chronoLocalDateA = dateNow().a((TemporalField) ChronoField.DAY_OF_MONTH, 1L).a((TemporalField) chronoField, l.longValue());
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            p(map, chronoField2, chronoLocalDateA.g(chronoField2));
            ChronoField chronoField3 = ChronoField.YEAR;
            p(map, chronoField3, chronoLocalDateA.g(chronoField3));
        }
    }

    public ChronoLocalDate P(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = w(chronoField).a(chronoField, ((Long) map.remove(chronoField)).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = w(chronoField2).a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = w(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle != ResolverStyle.SMART) {
            return date(iA, iA2, iA3);
        }
        try {
            return date(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return date(iA, iA2, 1).i(new j$.time.d((byte) 5));
        }
    }

    public ChronoLocalDate Q(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            w(chronoField2).b(chronoField2, ((Long) map.get(chronoField2)).longValue());
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        Long l2 = (Long) map.remove(chronoField3);
        int iA = resolverStyle != ResolverStyle.LENIENT ? w(chronoField).a(chronoField, l.longValue()) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            p(map, ChronoField.YEAR, A(eraOf(w(chronoField3).a(chronoField3, l2.longValue())), iA));
            return null;
        }
        ChronoField chronoField4 = ChronoField.YEAR;
        if (map.containsKey(chronoField4)) {
            p(map, chronoField4, A(dateYearDay(w(chronoField4).a(chronoField4, ((Long) map.get(chronoField4)).longValue()), 1).getEra(), iA));
            return null;
        }
        if (resolverStyle == ResolverStyle.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        List listEras = eras();
        if (listEras.isEmpty()) {
            p(map, chronoField4, iA);
            return null;
        }
        p(map, chronoField4, A((j) listEras.get(listEras.size() - 1), iA));
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* JADX INFO: renamed from: z */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }
}
