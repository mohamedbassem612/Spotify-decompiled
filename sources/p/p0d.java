package p;

import android.view.View;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.libs.connect.events.proto.ConnectDeviceDiscoverySnapshot;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p0d implements Comparator {
    public final /* synthetic */ byte a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return pap1.t(((m0d) obj).c, ((m0d) obj2).c);
            case 1:
                return pap1.t(Long.valueOf(((tom) obj2).d), Long.valueOf(((tom) obj).d));
            case 2:
                return pap1.t(d1o1.k((String) ((Map.Entry) obj).getKey()), d1o1.k((String) ((Map.Entry) obj2).getKey()));
            case 3:
                String str = ((w4i1) obj).b;
                Locale locale = Locale.ROOT;
                return pap1.t(str.toLowerCase(locale), ((w4i1) obj2).b.toLowerCase(locale));
            case 4:
                String str2 = ((jwm) obj).a.b;
                Locale locale2 = Locale.ROOT;
                return pap1.t(str2.toLowerCase(locale2), ((jwm) obj2).a.b.toLowerCase(locale2));
            case 5:
                return pap1.t(Long.valueOf(((tom) obj2).d), Long.valueOf(((tom) obj).d));
            case 6:
                return pap1.t(Long.valueOf(((tom) obj2).d), Long.valueOf(((tom) obj).d));
            case 7:
                String str3 = ((jwm) obj).a.b;
                Locale locale3 = Locale.ROOT;
                return pap1.t(str3.toLowerCase(locale3), ((jwm) obj2).a.b.toLowerCase(locale3));
            case 8:
                String str4 = ((w4i1) obj).b;
                Locale locale4 = Locale.ROOT;
                return pap1.t(str4.toLowerCase(locale4), ((w4i1) obj2).b.toLowerCase(locale4));
            case 9:
                return pap1.t(Integer.valueOf(((rr80) ((i220) obj).a).a), Integer.valueOf(((rr80) ((i220) obj2).a).a));
            case 10:
                return pap1.t(Integer.valueOf(((fqg) obj).b), Integer.valueOf(((fqg) obj2).b));
            case 11:
                return ((k8h) obj2).b() - ((k8h) obj).b();
            case 12:
                return pap1.t((Comparable) ((Map.Entry) obj2).getValue(), (Comparable) ((Map.Entry) obj).getValue());
            case 13:
                k7r k7rVar = ((j6k) obj).c.a;
                String str5 = k7rVar.a;
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
                LocalDateTime localDateTime = LocalDateTime.parse(str5, dateTimeFormatter);
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                OffsetDateTime offsetDateTimePlusMinutes = localDateTime.atOffset(zoneOffset).plusMinutes(k7rVar.b);
                k7r k7rVar2 = ((j6k) obj2).c.a;
                return pap1.t(offsetDateTimePlusMinutes, LocalDateTime.parse(k7rVar2.a, dateTimeFormatter).atOffset(zoneOffset).plusMinutes(k7rVar2.b));
            case 14:
                return pap1.t(Boolean.valueOf(((kx7) obj2).c), Boolean.valueOf(((kx7) obj).c));
            case 15:
                b0o1 b0o1VarM = xio1.m((jhm) obj2);
                chm chmVar = chm.c;
                return pap1.t(Boolean.valueOf(u890.j(b0o1VarM, chmVar)), Boolean.valueOf(u890.j(xio1.m((jhm) obj), chmVar)));
            case 16:
                return pap1.t((yzm) ((mmr0) obj2).a, (yzm) ((mmr0) obj).a);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return pap1.t(Long.valueOf(((zzm) obj2).d), Long.valueOf(((zzm) obj).d));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                WeakHashMap weakHashMap = b8k1.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return pap1.t(Integer.valueOf(((peo) obj).c), Integer.valueOf(((peo) obj2).c));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                DataSectionType dataSectionType = ((g2r) obj).f;
                int[] iArr = qyq.a;
                int i3 = iArr[dataSectionType.ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            i = 3;
                        }
                        eg.o();
                        return 0;
                    }
                    i = 2;
                }
                Integer numValueOf = Integer.valueOf(i);
                int i4 = iArr[((g2r) obj2).f.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            i2 = 3;
                        }
                        eg.o();
                        return 0;
                    }
                    i2 = 2;
                }
                return pap1.t(numValueOf, Integer.valueOf(i2));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return pap1.t(Boolean.valueOf(((m0u) obj2).f), Boolean.valueOf(((m0u) obj).f));
            case 22:
                return pap1.t(Boolean.valueOf(((m0u) obj2).f), Boolean.valueOf(((m0u) obj).f));
            case 23:
                return pap1.t(((zya) obj).a, ((zya) obj2).a);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return pap1.t(((zya) obj).a, ((zya) obj2).a);
            case 25:
                return pap1.t(((ConnectDeviceDiscoverySnapshot) obj).q(), ((ConnectDeviceDiscoverySnapshot) obj2).q());
            case 26:
                return pap1.t(((ConnectDeviceDiscoverySnapshot) obj).q(), ((ConnectDeviceDiscoverySnapshot) obj2).q());
            case 27:
                tcd0 tcd0Var = ((ucd0) obj2).b;
                Long l = tcd0Var != null ? tcd0Var.d : null;
                tcd0 tcd0Var2 = ((ucd0) obj).b;
                return pap1.t(l, tcd0Var2 != null ? tcd0Var2.d : null);
            case 28:
                ywi0 ywi0Var = ((zdz0) ((mmr0) obj).a).a.a;
                List list = p110.a;
                return pap1.t(Integer.valueOf(list.indexOf(ywi0Var)), Integer.valueOf(list.indexOf(((zdz0) ((mmr0) obj2).a).a.a)));
            default:
                return pap1.t(((hc11) obj).getName(), ((hc11) obj2).getName());
        }
    }
}
