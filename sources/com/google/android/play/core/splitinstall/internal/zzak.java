package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.zzf;
import com.google.android.play.core.splitinstall.zzh;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p.eg;
import p.g2o1;
import p.y7p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzak implements zzh {
    private final Context zza;
    private final g2o1 zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final y7p1 zze;

    public zzak(Context context, Executor executor, zzam zzamVar, g2o1 g2o1Var, y7p1 y7p1Var) {
        this.zza = context;
        this.zzb = g2o1Var;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = y7p1Var;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, zzf zzfVar) {
        Integer numZze = zzakVar.zze(list);
        if (numZze == null) {
            return;
        }
        if (numZze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(numZze.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, zzf zzfVar) {
        try {
            if (SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                zzfVar.zza();
            } else {
                zzfVar.zzb(-12);
            }
        } catch (Exception unused) {
            zzfVar.zzb(-12);
        }
    }

    private final Integer zze(List list) {
        FileLock fileLockTryLock;
        int i;
        try {
            g2o1 g2o1Var = this.zzb;
            g2o1Var.getClass();
            FileChannel channel = new RandomAccessFile(new File(g2o1Var.g(), "lock.tmp"), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Iterator it = list.iterator();
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                g2o1 g2o1Var2 = this.zzb;
                                g2o1Var2.getClass();
                                File file = new File(g2o1Var2.g(), "unverified-splits");
                                g2o1.e(file);
                                File fileD = g2o1.d(file, String.valueOf(stringExtra).concat(".apk"));
                                if ((fileD.exists() && fileD.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileD.exists()) {
                                    g2o1 g2o1Var3 = this.zzb;
                                    g2o1Var3.getClass();
                                    File file2 = new File(g2o1Var3.g(), "verified-splits");
                                    g2o1.e(file2);
                                    if (!g2o1.d(file2, String.valueOf(stringExtra).concat(".apk")).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i2 = bufferedInputStream.read(bArr);
                                                    if (i2 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i2);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th) {
                                                        zzai.zza(th, th);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    zzai.zza(th2, th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th4) {
                                            bufferedInputStream.close();
                                            throw th4;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th5) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th6) {
                                        zzai.zza(th5, th6);
                                    }
                                }
                                throw th5;
                            }
                        }
                        g2o1 g2o1Var4 = this.zzb;
                        g2o1Var4.getClass();
                        File file3 = new File(g2o1Var4.g(), "unverified-splits");
                        g2o1.e(file3);
                        File[] fileArrListFiles = file3.listFiles();
                        try {
                            if (this.zzc.zzc(fileArrListFiles) && this.zzc.zza(fileArrListFiles)) {
                                g2o1 g2o1Var5 = this.zzb;
                                g2o1Var5.getClass();
                                File file4 = new File(g2o1Var5.g(), "unverified-splits");
                                g2o1.e(file4);
                                File[] fileArrListFiles2 = file4.listFiles();
                                Arrays.sort(fileArrListFiles2);
                                int length = fileArrListFiles2.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    File file5 = fileArrListFiles2[length];
                                    file5.setWritable(false, true);
                                    file5.setWritable(false, false);
                                    File file6 = fileArrListFiles2[length];
                                    g2o1 g2o1Var6 = this.zzb;
                                    g2o1Var6.getClass();
                                    File file7 = new File(g2o1Var6.g(), "verified-splits");
                                    g2o1.e(file7);
                                    file6.renameTo(g2o1.d(file7, file6.getName()));
                                }
                            } else {
                                i = -11;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (IOException | Exception unused3) {
                        i = -13;
                    }
                    numValueOf = Integer.valueOf(i);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th7) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th8) {
                        zzai.zza(th7, th8);
                    }
                }
                throw th7;
            }
        } catch (Exception unused4) {
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, zzf zzfVar) {
        if (SplitCompat.zze()) {
            this.zzd.execute(new zzaj(this, list, zzfVar));
        } else {
            eg.m("Ingestion should only be called in SplitCompat mode.");
        }
    }
}
