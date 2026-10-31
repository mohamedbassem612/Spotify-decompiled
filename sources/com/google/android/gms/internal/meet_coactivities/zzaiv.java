package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.dm5;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaiv {
    private static final Logger zza = Logger.getLogger(zzaiv.class.getName());

    private zzaiv() {
    }

    public static Object zza(String str) {
        zzpu zzpuVar = new zzpu(new StringReader(str));
        try {
            Object objZzb = zzb(zzpuVar);
            try {
                return objZzb;
            } catch (IOException e) {
                return objZzb;
            }
        } finally {
            try {
                zzpuVar.close();
            } catch (IOException e2) {
                zza.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e2);
            }
        }
    }

    private static Object zzb(zzpu zzpuVar) throws IOException {
        dm5.z(zzpuVar.zzl(), "unexpected end of JSON");
        int iZzn = zzpuVar.zzn() - 1;
        if (iZzn == 0) {
            zzpuVar.zzg();
            ArrayList arrayList = new ArrayList();
            while (zzpuVar.zzl()) {
                arrayList.add(zzb(zzpuVar));
            }
            dm5.z(zzpuVar.zzn() == 2, "Bad token: ".concat(zzpuVar.zzc()));
            zzpuVar.zzi();
            return Collections.unmodifiableList(arrayList);
        }
        if (iZzn == 2) {
            zzpuVar.zzh();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (zzpuVar.zzl()) {
                linkedHashMap.put(zzpuVar.zze(), zzb(zzpuVar));
            }
            dm5.z(zzpuVar.zzn() == 4, "Bad token: ".concat(zzpuVar.zzc()));
            zzpuVar.zzj();
            return Collections.unmodifiableMap(linkedHashMap);
        }
        if (iZzn == 5) {
            return zzpuVar.zzf();
        }
        if (iZzn == 6) {
            return Double.valueOf(zzpuVar.zza());
        }
        if (iZzn == 7) {
            return Boolean.valueOf(zzpuVar.zzm());
        }
        if (iZzn == 8) {
            zzpuVar.zzk();
            return null;
        }
        eg.m("Bad token: ".concat(zzpuVar.zzc()));
        return null;
    }
}
