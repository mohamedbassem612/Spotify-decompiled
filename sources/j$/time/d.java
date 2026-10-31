package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class d implements j$.time.temporal.k {
    public final /* synthetic */ byte a;

    public /* synthetic */ d(byte b) {
        this.a = b;
    }

    @Override // j$.time.temporal.k
    public Temporal f(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.a(chronoField, temporal.k(chronoField).d);
    }

    public Object k(TemporalAccessor temporalAccessor) {
        byte b = this.a;
        d dVar = j$.time.temporal.m.a;
        switch (b) {
            case 0:
                return Instant.x(temporalAccessor);
            case 1:
                return LocalDate.D(temporalAccessor);
            case 2:
                return LocalDateTime.from(temporalAccessor);
            case 3:
                return OffsetDateTime.p(temporalAccessor);
            case 4:
                d dVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(dVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 5:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.h(chronoField)) {
                    return LocalTime.P(temporalAccessor.j(chronoField));
                }
                return null;
            case 6:
                return (ZoneId) temporalAccessor.d(dVar);
            case 7:
                return (Chronology) temporalAccessor.d(j$.time.temporal.m.b);
            case 8:
                return (TemporalUnit) temporalAccessor.d(j$.time.temporal.m.c);
            case 9:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.h(chronoField2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.g(chronoField2));
                }
                return null;
            case 10:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(dVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.d(j$.time.temporal.m.d);
            case 11:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.h(chronoField3)) {
                    return LocalDate.ofEpochDay(temporalAccessor.j(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "ZoneId";
            case 7:
                return "Chronology";
            case 8:
                return "Precision";
            case 9:
                return "ZoneOffset";
            case 10:
                return "Zone";
            case 11:
                return "LocalDate";
            case 12:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
