package p;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class doa1 {
    public static final bg11 a = b380.t(12);

    public static b380 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new pt7((byte) 0)).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && zoi1.P(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return b380.p(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a A[RETURN] */
    public static b380 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        b380 b380VarA;
        b380 b380VarP;
        int speakerLayoutChannelMask;
        boolean zU = aym.u(audioDeviceInfo.getType());
        bg11 bg11Var = a;
        if (!zU) {
            if (audioDeviceInfo.getType() == 1) {
                return b380.t(4);
            }
            byte b = 2;
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return b380.t(Integer.valueOf(speakerLayoutChannelMask));
                }
                oon1.H("Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return bg11Var;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                b380 b380VarA2 = a(audioDeviceInfo);
                if (!b380VarA2.isEmpty()) {
                    return b380VarA2;
                }
                b380 b380VarN = mb4.n(audioDeviceInfo.getAudioDescriptors());
                if (!b380VarN.isEmpty()) {
                    return b380VarN;
                }
            } else if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    b380 b380VarA3 = a(audioDeviceInfo);
                    if (!b380VarA3.isEmpty()) {
                        return b380VarA3;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            w280 w280Var = b380.b;
                            b380VarP = bg11.e;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorC = um5.c(it.next());
                                if (audioDescriptorC.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorC.getDescriptor();
                                    if (descriptor.length != 3) {
                                        oon1.H("Invalid SADB length: " + descriptor.length);
                                    } else {
                                        int i2 = 0;
                                        if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                            byte b2 = descriptor[0];
                                            i2 = (b2 & 1) != 0 ? 12 : 0;
                                            if ((b2 & 2) != 0) {
                                                i2 |= 32;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i2 |= 16;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i2 |= 192;
                                            }
                                            if ((b2 & 16) != 0) {
                                                i2 |= SemanticState.ReadOnly;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i2 |= 768;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i2 |= 201326592;
                                            }
                                            byte b3 = descriptor[1];
                                            if ((b3 & 1) != 0) {
                                                i2 |= 81920;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i2 |= SemanticState.Multiline;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i2 |= 32768;
                                            }
                                            if ((b3 & 8) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b3 & 16) != 0) {
                                                i2 |= 33554432;
                                            }
                                            if ((b3 & 32) != 0) {
                                                i2 |= 262144;
                                            }
                                            if ((b3 & 64) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b3 & 128) != 0) {
                                                i2 |= 3145728;
                                            }
                                            byte b4 = descriptor[2];
                                            if ((b4 & 1) != 0) {
                                                i2 |= 655360;
                                            }
                                            if ((b4 & 2) != 0) {
                                                i2 = 8388608 | i2;
                                            }
                                            if ((b4 & 4) != 0) {
                                                i2 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                            arrayList.sort(new m(b));
                            b380VarP = b380.p(arrayList);
                        }
                        if (!b380VarP.isEmpty()) {
                            return b380VarP;
                        }
                    }
                    b380 b380VarN2 = mb4.n(audioDescriptors);
                    if (!b380VarN2.isEmpty()) {
                        return b380VarN2;
                    }
                } else if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    b380VarA = a(audioDeviceInfo);
                    if (!b380VarA.isEmpty()) {
                        return b380VarA;
                    }
                }
            } else if (i >= 31) {
                b380VarA = a(audioDeviceInfo);
                if (!b380VarA.isEmpty()) {
                    return b380VarA;
                }
            }
        }
        return bg11Var;
    }
}
