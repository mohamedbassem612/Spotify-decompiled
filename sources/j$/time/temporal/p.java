package j$.time.temporal;

import j$.nio.file.r;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.ResolverStyle;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class p implements TemporalField {
    public static final o f = o.f(1, 7);
    public static final o g = o.g(0, 4, 6);
    public static final o h = o.g(0, 52, 54);
    public static final o i = o.g(1, 52, 53);
    public final String a;
    public final WeekFields b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final o e;

    public p(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, o oVar) {
        this.a = str;
        this.b = weekFields;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = oVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor D(Map map, b0 b0Var, ResolverStyle resolverStyle) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        HashMap map2 = (HashMap) map;
        long jLongValue = ((Long) map2.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        o oVar = this.e;
        WeekFields weekFields = this.b;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((oVar.a(this, jLongValue) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map2.remove(this);
            map2.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map2.containsKey(chronoField)) {
            return null;
        }
        int iFloorMod = Math.floorMod(chronoField.b.a(chronoField, ((Long) map2.get(chronoField)).longValue()) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyN = Chronology.n(b0Var);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map2.containsKey(chronoField2)) {
            if ((temporalUnit != WeekFields.h && temporalUnit != ChronoUnit.FOREVER) || !map2.containsKey(weekFields.f) || !map2.containsKey(weekFields.e)) {
                return null;
            }
            p pVar = weekFields.f;
            int iA = pVar.e.a(weekFields.f, ((Long) map2.get(pVar)).longValue());
            if (resolverStyle == ResolverStyle.LENIENT) {
                chronoLocalDateB = e(chronologyN, iA, 1, iFloorMod).b(Math.subtractExact(((Long) map2.get(weekFields.e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                p pVar2 = weekFields.e;
                ChronoLocalDate chronoLocalDateE = e(chronologyN, iA, pVar2.e.a(weekFields.e, ((Long) map2.get(pVar2)).longValue()), iFloorMod);
                if (resolverStyle == ResolverStyle.STRICT && c(chronoLocalDateE) != iA) {
                    r.h("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map2.remove(this);
            map2.remove(weekFields.f);
            map2.remove(weekFields.e);
            map2.remove(chronoField);
            return chronoLocalDateB;
        }
        int iA2 = chronoField2.b.a(chronoField2, ((Long) map2.get(chronoField2)).longValue());
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map2.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map2.get(chronoField3)).longValue();
                long j = intExact;
                if (resolverStyle == ResolverStyle.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyN.date(iA2, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(chronoLocalDateB4);
                    int iG = chronoLocalDateB4.g(ChronoField.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(iG, iB), iG)), 7L), iFloorMod - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateDate = chronologyN.date(iA2, chronoField3.b.a(chronoField3, jLongValue2), 1);
                    long jA = oVar.a(this, j);
                    int iB2 = b(chronoLocalDateDate);
                    int iG2 = chronoLocalDateDate.g(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateDate.b((((int) (jA - ((long) a(h(iG2, iB2), iG2)))) * 7) + (iFloorMod - b(chronoLocalDateDate)), (TemporalUnit) ChronoUnit.DAYS);
                    if (resolverStyle == ResolverStyle.STRICT && chronoLocalDateB5.j(chronoField3) != jLongValue2) {
                        r.h("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map2.remove(this);
                map2.remove(chronoField2);
                map2.remove(chronoField3);
                map2.remove(chronoField);
                return chronoLocalDateB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = intExact;
        ChronoLocalDate chronoLocalDateDate2 = chronologyN.date(iA2, 1, 1);
        if (resolverStyle == ResolverStyle.LENIENT) {
            int iB3 = b(chronoLocalDateDate2);
            int iG3 = chronoLocalDateDate2.g(ChronoField.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateDate2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(iG3, iB3), iG3)), 7L), iFloorMod - b(chronoLocalDateDate2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = oVar.a(this, j2);
            int iB4 = b(chronoLocalDateDate2);
            int iG4 = chronoLocalDateDate2.g(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateDate2.b((((int) (jA2 - ((long) a(h(iG4, iB4), iG4)))) * 7) + (iFloorMod - b(chronoLocalDateDate2)), (TemporalUnit) ChronoUnit.DAYS);
            if (resolverStyle == ResolverStyle.STRICT && chronoLocalDateB6.j(chronoField2) != iA2) {
                r.h("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map2.remove(this);
        map2.remove(chronoField2);
        map2.remove(chronoField);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.TemporalField
    public final long K(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int iG = temporalAccessor.g(ChronoField.DAY_OF_MONTH);
            iC = a(h(iG, iB), iG);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int iG2 = temporalAccessor.g(ChronoField.DAY_OF_YEAR);
            iC = a(h(iG2, iB2), iG2);
        } else if (temporalUnit == WeekFields.h) {
            iC = d(temporalAccessor);
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal O(Temporal temporal, long j) {
        int iA = this.e.a(this, j);
        int iG = temporal.g(this);
        if (iA == iG) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(iA - iG, this.c);
        }
        WeekFields weekFields = this.b;
        return e(Chronology.n(temporal), (int) j, temporal.g(weekFields.e), temporal.g(weekFields.c));
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.g(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iG = temporalAccessor.g(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iG2 = temporalAccessor.g(chronoField);
        int iH = h(iG2, iB);
        int iA = a(iH, iG2);
        if (iA == 0) {
            return iG - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.k(chronoField).d) + this.b.b) ? iG + 1 : iG;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iG = temporalAccessor.g(chronoField);
        int iH = h(iG, iB);
        int iA2 = a(iH, iG);
        if (iA2 == 0) {
            return d(Chronology.n(temporalAccessor).E(temporalAccessor).c(iG, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.k(chronoField).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final ChronoLocalDate e(Chronology chronology, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateDate = chronology.date(i2, 1, 1);
        int iH = h(1, b(chronoLocalDateDate));
        return chronoLocalDateDate.b(((Math.min(i3, a(iH, chronoLocalDateDate.lengthOfYear() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public final o f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iH = h(temporalAccessor.g(chronoField), b(temporalAccessor));
        o oVarK = temporalAccessor.k(chronoField);
        return o.f(a(iH, (int) oVarK.a), a(iH, (int) oVarK.d));
    }

    public final o g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.h(chronoField)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iG = temporalAccessor.g(chronoField);
        int iH = h(iG, iB);
        int iA = a(iH, iG);
        if (iA == 0) {
            return g(Chronology.n(temporalAccessor).E(temporalAccessor).c(iG + 7, (TemporalUnit) ChronoUnit.DAYS));
        }
        int i2 = (int) temporalAccessor.k(chronoField).d;
        int iA2 = a(iH, this.b.b + i2);
        return iA >= iA2 ? g(Chronology.n(temporalAccessor).E(temporalAccessor).b((i2 - iG) + 8, (TemporalUnit) ChronoUnit.DAYS)) : o.f(1L, iA2 - 1);
    }

    public final int h(int i2, int i3) {
        int iFloorMod = Math.floorMod(i2 - i3, 7);
        return iFloorMod + 1 > this.b.b ? 7 - iFloorMod : -iFloorMod;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean p(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.h(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.h(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.h(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final o range() {
        return this.e;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final o x(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }
}
