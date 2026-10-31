package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class w {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00a9, please report this as an issue */
    public w(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        int i;
        ZoneId zoneIdD;
        Chronology chronology = dateTimeFormatter.d;
        ZoneId zoneId = dateTimeFormatter.e;
        if (chronology != null || zoneId != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.d(j$.time.temporal.m.b);
            ZoneId zoneId2 = (ZoneId) temporalAccessor.d(j$.time.temporal.m.a);
            ChronoLocalDate chronoLocalDateE = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            zoneId = Objects.equals(zoneId, zoneId2) ? null : zoneId;
            if (chronology != null || zoneId != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (zoneId == null) {
                    zoneId2 = zoneId != null ? zoneId : zoneId2;
                    if (chronology != null) {
                        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                            chronoLocalDateE = chronology3.E(temporalAccessor);
                        } else if (chronology == IsoChronology.INSTANCE || chronology2 != null) {
                            for (ChronoField chronoField : ChronoField.values()) {
                                if (!chronoField.isDateBased() && temporalAccessor.h(chronoField)) {
                                    j$.nio.file.r.l("Unable to apply override chronology '", chronology, "' because the temporal object being formatted contains date fields but does not represent a whole date: ", temporalAccessor);
                                    throw null;
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.nio.file.m(chronoLocalDateE, temporalAccessor, chronology3, zoneId2);
                } else if (temporalAccessor.h(ChronoField.INSTANT_SECONDS)) {
                    IsoChronology isoChronology = IsoChronology.INSTANCE;
                    if (chronology3 == null) {
                        Objects.requireNonNull(isoChronology, "defaultObj");
                        chronology3 = isoChronology;
                    }
                    temporalAccessor = chronology3.N(Instant.x(temporalAccessor), zoneId);
                } else {
                    try {
                        ZoneRules rules = zoneId.getRules();
                        zoneIdD = rules.h() ? rules.d(Instant.c) : zoneId;
                    } catch (ZoneRulesException unused) {
                    }
                    if (zoneIdD instanceof ZoneOffset) {
                        ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                        if (temporalAccessor.h(chronoField2) && temporalAccessor.g(chronoField2) != zoneId.getRules().d(Instant.c).getTotalSeconds()) {
                            j$.nio.file.r.l("Unable to apply override zone '", zoneId, "' because the temporal object being formatted has a different offset but does not represent an instant: ", temporalAccessor);
                            throw null;
                        }
                    }
                    if (zoneId != null) {
                    }
                    if (chronology != null) {
                        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                            chronoLocalDateE = chronology3.E(temporalAccessor);
                        } else if (chronology == IsoChronology.INSTANCE) {
                            while (i < r2) {
                                if (!chronoField.isDateBased()) {
                                }
                            }
                        } else {
                            while (i < r2) {
                                if (!chronoField.isDateBased()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.nio.file.m(chronoLocalDateE, temporalAccessor, chronology3, zoneId2);
                }
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.h(temporalField)) {
            return Long.valueOf(temporalAccessor.j(temporalField));
        }
        return null;
    }

    public final Object b(j$.time.d dVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objD = temporalAccessor.d(dVar);
        if (objD != null || this.c != 0) {
            return objD;
        }
        j$.nio.file.r.l("Unable to extract ", dVar, " from temporal ", temporalAccessor);
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
