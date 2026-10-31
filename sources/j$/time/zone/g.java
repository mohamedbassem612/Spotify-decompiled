package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class g {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentMap c;
    public static volatile Set d;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new f(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = Collections.unmodifiableSet(linkedHashSet);
    }

    public static ZoneRules a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c;
        g gVar = (g) concurrentHashMap.get(str);
        if (gVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new ZoneRulesException("No time-zone data files registered");
            }
            throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
        }
        if (gVar.a.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new ZoneRulesException("Not a built-in time zone: ".concat(str));
    }

    public static void b(g gVar) {
        Objects.requireNonNull(gVar, "provider");
        synchronized (g.class) {
            try {
                for (String str : gVar.a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((g) ((ConcurrentHashMap) c).putIfAbsent(str, gVar)) != null) {
                        throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + gVar);
                    }
                }
                d = Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) c).keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        b.add(gVar);
    }
}
