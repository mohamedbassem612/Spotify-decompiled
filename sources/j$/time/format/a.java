package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class a extends z {
    public final /* synthetic */ y d;

    public a(y yVar) {
        this.d = yVar;
    }

    @Override // j$.time.format.z
    public final String b(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.z
    public final String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.z
    public final Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.z
    public final Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
