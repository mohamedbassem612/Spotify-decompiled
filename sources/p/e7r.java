package p;

import com.google.type.DateTime;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e7r {
    public final String a(DateTime dateTime) {
        return LocalDate.of(dateTime.getYear() == 0 ? LocalDate.now().getYear() : dateTime.getYear(), dateTime.r(), dateTime.n()).format(DateTimeFormatter.ofPattern("MMM"));
    }
}
