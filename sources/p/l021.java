package p;

import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.base.java.logging.Logger;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l021 implements jlq0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ l021(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void c() {
        File[] fileArrListFiles;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((y2g0) obj).a(new vwz0(this, (byte) 26));
                break;
            default:
                UserDirectoryCachePaths userDirectoryCachePaths = (UserDirectoryCachePaths) this.b;
                String settingsPath = userDirectoryCachePaths.getSettingsPath();
                String cachePath = userDirectoryCachePaths.getCachePath();
                jqb1 jqb1Var = (jqb1) obj;
                dma1 dma1Var = jqb1Var.a;
                if (settingsPath != null) {
                    bma1 bma1Var = jqb1.c;
                    int iL = dma1Var.l(bma1Var, 0) + 1;
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.b(bma1Var, iL);
                    hma1VarEdit.h();
                    Logger.g("Current startup count is %d", Integer.valueOf(iL));
                    if (iL > 5) {
                        bma1 bma1Var2 = jqb1.d;
                        Enum r5 = iqb1.a;
                        int iL2 = dma1Var.l(bma1Var2, 0);
                        if (iL2 >= 0) {
                            Enum[] enumArr = iqb1.b;
                            if (iL2 < enumArr.length) {
                                r5 = enumArr[iL2];
                            }
                        }
                        int iOrdinal = r5.ordinal() + 1;
                        if (iOrdinal > 2) {
                            iOrdinal = 0;
                        }
                        hma1 hma1VarEdit2 = dma1Var.edit();
                        hma1VarEdit2.b(bma1Var2, iOrdinal);
                        hma1VarEdit2.h();
                        File file = new File(settingsPath, "Users");
                        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2.isDirectory()) {
                                    Logger.d("SpotifyService: Deleting state files", new Object[0]);
                                    StringBuilder sb = new StringBuilder();
                                    File[] fileArrListFiles2 = file2.listFiles();
                                    if (fileArrListFiles2 != null) {
                                        for (File file3 : fileArrListFiles2) {
                                            if (file3.isFile() && r5.a(file3.getName()) && file3.delete()) {
                                                sb.append("Deleted ");
                                                sb.append(file3.getName());
                                                sb.append(". ");
                                            }
                                        }
                                    }
                                    Logger.d("SpotifyService %s", sb.toString());
                                }
                            }
                        }
                        if (jqb1Var.b.nextDouble() >= 0.99d) {
                            l1d.z("Cleaning state restore files (Throttled 99%), policy \"", String.valueOf(r5), "\"");
                        }
                    }
                }
                Logger.g("Cache path: %s\nSettings path: %s", cachePath, settingsPath);
                break;
        }
    }

    public final String getName() {
        switch (this.a) {
            case 0:
                return "RemoteControlClientStartupOperation";
            default:
                return "StorageInitOperation";
        }
    }
}
